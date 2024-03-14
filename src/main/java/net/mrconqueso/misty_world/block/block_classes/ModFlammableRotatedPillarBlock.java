package net.mrconqueso.misty_world.block.block_classes;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.mrconqueso.misty_world.block.ModBlocks;
import net.mrconqueso.misty_world.item.item_classes.ModChiselItem;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {
    private static final Map<Block, Block> logToStrippedLogMap = new HashMap<>();
    private static final Map<Block, Block> logToCarvedLogMap = new HashMap<>();
    private static final Map<Block, Block> woodToStrippedWoodMap = new HashMap<>();
    public ModFlammableRotatedPillarBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }
    
    public static void setLogToStrippedLogMap() {
        logToStrippedLogMap.put(ModBlocks.ASPEN_LOG.get(), ModBlocks.STRIPPED_ASPEN_LOG.get());
        logToStrippedLogMap.put(ModBlocks.WILLOW_LOG.get(), ModBlocks.STRIPPED_WILLOW_LOG.get());
        logToStrippedLogMap.put(ModBlocks.ARAUCARIA_LOG.get(), ModBlocks.STRIPPED_ARAUCARIA_LOG.get());
        logToStrippedLogMap.put(ModBlocks.FOGGY_OAK_LOG.get(), ModBlocks.STRIPPED_FOGGY_OAK_LOG.get());
        logToStrippedLogMap.put(ModBlocks.FOGGY_PINE_LOG.get(), ModBlocks.STRIPPED_FOGGY_PINE_LOG.get());
        logToStrippedLogMap.put(ModBlocks.SNOWY_TREE_LOG.get(), ModBlocks.STRIPPED_SNOWY_TREE_LOG.get());
        logToStrippedLogMap.put(ModBlocks.STONE_TREE_LOG.get(), ModBlocks.STRIPPED_STONE_TREE_LOG.get());
        logToStrippedLogMap.put(ModBlocks.RUBBER_TREE_LOG.get(), ModBlocks.STRIPPED_RUBBER_TREE_LOG.get());
        logToStrippedLogMap.put(ModBlocks.TROPIC_TREE_LOG.get(), ModBlocks.STRIPPED_TROPIC_TREE_LOG.get());
        logToStrippedLogMap.put(ModBlocks.PRICKLY_TREE_LOG.get(), ModBlocks.STRIPPED_PRICKLY_TREE_LOG.get());
        logToStrippedLogMap.put(ModBlocks.SWAMPY_POPLAR_LOG.get(), ModBlocks.STRIPPED_SWAMPY_POPLAR_LOG.get());
        logToStrippedLogMap.put(ModBlocks.UMBRELLA_TREE_LOG.get(), ModBlocks.STRIPPED_UMBRELLA_TREE_LOG.get());
        logToStrippedLogMap.put(ModBlocks.FOREST_DECEIVER_LOG.get(), ModBlocks.STRIPPED_FOREST_DECEIVER_LOG.get());
    }
    public Map<Block, Block> getLogToStrippedLogMap() {
        return logToStrippedLogMap;
    }

    public static void setLogToCarvedLogMap() {
        logToCarvedLogMap.put(ModBlocks.ASPEN_LOG.get(), ModBlocks.CARVED_ASPEN_LOG.get());
        logToCarvedLogMap.put(ModBlocks.WILLOW_LOG.get(), ModBlocks.CARVED_WILLOW_LOG.get());
        logToCarvedLogMap.put(ModBlocks.ARAUCARIA_LOG.get(), ModBlocks.CARVED_ARAUCARIA_LOG.get());
        logToCarvedLogMap.put(ModBlocks.FOGGY_OAK_LOG.get(), ModBlocks.CARVED_FOGGY_OAK_LOG.get());
        logToCarvedLogMap.put(ModBlocks.FOGGY_PINE_LOG.get(), ModBlocks.CARVED_FOGGY_PINE_LOG.get());
        logToCarvedLogMap.put(ModBlocks.SNOWY_TREE_LOG.get(), ModBlocks.CARVED_SNOWY_TREE_LOG.get());
        logToCarvedLogMap.put(ModBlocks.STONE_TREE_LOG.get(), ModBlocks.CARVED_STONE_TREE_LOG.get());
        logToCarvedLogMap.put(ModBlocks.RUBBER_TREE_LOG.get(), ModBlocks.CARVED_RUBBER_TREE_LOG.get());
        logToCarvedLogMap.put(ModBlocks.TROPIC_TREE_LOG.get(), ModBlocks.CARVED_TROPIC_TREE_LOG.get());
        logToCarvedLogMap.put(ModBlocks.PRICKLY_TREE_LOG.get(), ModBlocks.CARVED_PRICKLY_TREE_LOG.get());
        logToCarvedLogMap.put(ModBlocks.SWAMPY_POPLAR_LOG.get(), ModBlocks.CARVED_SWAMPY_POPLAR_LOG.get());
        logToCarvedLogMap.put(ModBlocks.UMBRELLA_TREE_LOG.get(), ModBlocks.CARVED_UMBRELLA_TREE_LOG.get());
        logToCarvedLogMap.put(ModBlocks.FOREST_DECEIVER_LOG.get(), ModBlocks.CARVED_FOREST_DECEIVER_LOG.get());
    }

    public static Map<Block, Block> getLogToCarvedLogMap() {
        return logToCarvedLogMap;
    }

    public void setWoodToStrippedWoodMap() {
        woodToStrippedWoodMap.put(ModBlocks.ASPEN_WOOD.get(), ModBlocks.STRIPPED_ASPEN_WOOD.get());
        woodToStrippedWoodMap.put(ModBlocks.WILLOW_WOOD.get(), ModBlocks.STRIPPED_WILLOW_WOOD.get());
        woodToStrippedWoodMap.put(ModBlocks.ARAUCARIA_WOOD.get(), ModBlocks.STRIPPED_ARAUCARIA_WOOD.get());
        woodToStrippedWoodMap.put(ModBlocks.FOGGY_OAK_WOOD.get(), ModBlocks.STRIPPED_FOGGY_OAK_WOOD.get());
        woodToStrippedWoodMap.put(ModBlocks.FOGGY_PINE_WOOD.get(), ModBlocks.STRIPPED_FOGGY_PINE_WOOD.get());
        woodToStrippedWoodMap.put(ModBlocks.SNOWY_TREE_WOOD.get(), ModBlocks.STRIPPED_SNOWY_TREE_WOOD.get());
        woodToStrippedWoodMap.put(ModBlocks.STONE_TREE_WOOD.get(), ModBlocks.STRIPPED_STONE_TREE_WOOD.get());
        woodToStrippedWoodMap.put(ModBlocks.RUBBER_TREE_WOOD.get(), ModBlocks.STRIPPED_RUBBER_TREE_WOOD.get());
        woodToStrippedWoodMap.put(ModBlocks.TROPIC_TREE_WOOD.get(), ModBlocks.STRIPPED_TROPIC_TREE_WOOD.get());
        woodToStrippedWoodMap.put(ModBlocks.PRICKLY_TREE_WOOD.get(), ModBlocks.STRIPPED_PRICKLY_TREE_WOOD.get());
        woodToStrippedWoodMap.put(ModBlocks.SWAMPY_POPLAR_WOOD.get(), ModBlocks.STRIPPED_SWAMPY_POPLAR_WOOD.get());
        woodToStrippedWoodMap.put(ModBlocks.UMBRELLA_TREE_WOOD.get(), ModBlocks.STRIPPED_UMBRELLA_TREE_WOOD.get());
        woodToStrippedWoodMap.put(ModBlocks.FOREST_DECEIVER_WOOD.get(), ModBlocks.STRIPPED_FOREST_DECEIVER_WOOD.get());
    }
    public Map<Block, Block> getWoodToStrippedWoodMap() {
        return woodToStrippedWoodMap;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {

        setLogToStrippedLogMap();
        setLogToCarvedLogMap();
        setWoodToStrippedWoodMap();

        Block block = state.getBlock();

        if(context.getItemInHand().getItem() instanceof AxeItem) {
            if(getLogToStrippedLogMap().containsKey(block)) {
                return getLogToStrippedLogMap().get(block).defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(getWoodToStrippedWoodMap().containsKey(block)) {
                return getWoodToStrippedWoodMap().get(block).defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        } else if (context.getItemInHand().getItem() instanceof ModChiselItem) {
            
            if(getLogToCarvedLogMap().containsKey(block)) {
                return getLogToCarvedLogMap().get(block).defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
