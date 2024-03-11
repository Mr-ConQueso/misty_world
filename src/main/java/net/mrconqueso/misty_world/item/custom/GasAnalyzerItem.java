package net.mrconqueso.misty_world.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.mrconqueso.misty_world.sound.ModSounds;

public class GasAnalyzerItem extends Item {
    public GasAnalyzerItem(Properties pProperties) {
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
}
