package net.mrconqueso.misty_world.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.IPlantable;
import net.mrconqueso.misty_world.item.ModItems;

public class DesertCottonCropBlock extends CropBlock {
    public static final int FIRST_STAGE_MAX_AGE = 7;
    public static final int SECOND_STAGE_MAX_AGE = 7;

    public static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[] {
            Block.box(0.0, 0.0, 0.0, 16.0, 2.0, 16.0), // Stage 0 (Bottom)
            Block.box(0.0, 0.0, 0.0, 16.0, 4.0, 16.0), // Stage 1 (Bottom)
            Block.box(0.0, 0.0, 0.0, 16.0, 6.0, 16.0), // Stage 2 (Bottom)
            Block.box(0.0, 0.0, 0.0, 16.0, 8.0, 16.0), // Stage 3 (Bottom)
            Block.box(0.0, 0.0, 0.0, 16.0, 10.0, 16.0), // Stage 4 (Bottom)
            Block.box(0.0, 0.0, 0.0, 16.0, 12.0, 16.0), // Stage 5 (Bottom)
            Block.box(0.0, 0.0, 0.0, 16.0, 14.0, 16.0), // Stage 6 (Bottom)
            Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 16.0), // Stage 7 (Bottom)
            Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 16.0), // Stage 8 (Top)
            Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 16.0), // Stage 9 (Top)
            Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 16.0), // Stage 10 (Top)
            Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 16.0), // Stage 11 (Top)
            Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 16.0), // Stage 12 (Top)
            Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 16.0), // Stage 13 (Top)
            Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 16.0) // Stage 14 (Top)
    };

    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 14);

    public DesertCottonCropBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (!pLevel.isAreaLoaded(pPos, 1)) return;
        if (pLevel.getRawBrightness(pPos, 0) >= 9) {
            int currentAge = this.getAge(pState);

            if (currentAge < this.getMaxAge()) {
                float growthSpeed = getGrowthSpeed(this, pLevel, pPos);

                if (net.minecraftforge.common.ForgeHooks.onCropsGrowPre(pLevel, pPos, pState, pRandom.nextInt((int)(25.0F / growthSpeed) + 1) == 0)) {
                    if (currentAge == FIRST_STAGE_MAX_AGE) {
                        if (pLevel.getBlockState(pPos.above(1)).is(Blocks.AIR) && pLevel.getBlockState(pPos.above(1)).getValue(AGE) < SECOND_STAGE_MAX_AGE) {
                            pLevel.setBlock(pPos.above(1), this.getStateForAge(currentAge + 1), 2);
                        }
                    } else {
                        pLevel.setBlock(pPos, this.getStateForAge(currentAge + 1), 2);
                    }

                    net.minecraftforge.common.ForgeHooks.onCropsGrowPost(pLevel, pPos, pState);
                }
            }
        }
    }

    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, IPlantable plantable) {
        return super.mayPlaceOn(state, world, pos);
    }

    @Override
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        return super.canSurvive(pState, pLevel, pPos) || (pLevel.getBlockState(pPos.below(1)).is(this) &&
                pLevel.getBlockState(pPos.below(1)).getValue(AGE) == FIRST_STAGE_MAX_AGE);
    }

    @Override
    public void growCrops(Level pLevel, BlockPos pPos, BlockState pState) {
        int nextAge = this.getAge(pState) + this.getBonemealAgeIncrease(pLevel);
        int maxAge = this.getMaxAge();

        if (nextAge > maxAge) {
            nextAge = maxAge;
        }

        if (this.getAge(pState) == FIRST_STAGE_MAX_AGE && pLevel.getBlockState(pPos.above(1)).is(Blocks.AIR)) {
            pLevel.setBlock(pPos.above(1), this.getStateForAge(nextAge), 2);
        } else {
            pLevel.setBlock(pPos, this.getStateForAge(nextAge - SECOND_STAGE_MAX_AGE), 2);
        }
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE_BY_AGE[this.getAge(pState)];
    }

    @Override
    public int getMaxAge() {
        return FIRST_STAGE_MAX_AGE + SECOND_STAGE_MAX_AGE;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.DESERT_COTTON_SEED.get();
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }
}
