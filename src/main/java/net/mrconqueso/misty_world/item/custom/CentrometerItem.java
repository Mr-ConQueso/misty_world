package net.mrconqueso.misty_world.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.mrconqueso.misty_world.init.ModSounds;

public class CentrometerItem extends Item {
    public int angle = 0;
    public CentrometerItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {

        BlockPos positionClicked = pContext.getClickedPos();
        Level level =pContext.getLevel();

        if (level.isClientSide) {
            level.playSeededSound(null, positionClicked.getX(), positionClicked.getY(), positionClicked.getZ(),
                    ModSounds.USE_GAS_ANALYZER.get(), SoundSource.PLAYERS, 1f, 1f, 0);
        }

        return InteractionResult.SUCCESS;
    }

    public static int getValue(ItemStack stack) {
        CompoundTag nbtCompound = stack.getTag();
        if (nbtCompound != null) {
            return nbtCompound.getInt("angle");
        }
        return 0;
    }

    public static void setValue(ItemStack stack, int angle) {
        CompoundTag nbtCompound = stack.getOrCreateTag();
        nbtCompound.putInt("angle", angle);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        ItemStack itemStack = pPlayer.getItemInHand(pUsedHand);
        this.angle = getValue(itemStack);

        if (this.angle < 66)
            this.angle++;
        else if (this.angle == 66)
            this.angle = 0;

        CentrometerItem.setValue(pPlayer.getItemInHand(InteractionHand.MAIN_HAND), this.angle);


        return InteractionResultHolder.success(itemStack);
    }
}
