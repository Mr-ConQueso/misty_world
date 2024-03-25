package net.mrconqueso.misty_world.item.item_classes;

import net.minecraft.ChatFormatting;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.Model;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CauldronBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.mrconqueso.misty_world.api.item.DyableRubberItem;
import net.mrconqueso.misty_world.api.item.ISuit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public class ModDyableRubberArmorItem extends ArmorItem implements DyableRubberItem {
    private final String thinTex = "mist:textures/models/armor/rubber_layer_1_a.png";
    private final String thickTex = "mist:textures/models/armor/rubber_layer_1.png";
    private final String legginsTex = "mist:textures/models/armor/rubber_layer_2.png";
    public ModDyableRubberArmorItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext pContext) {
        ItemStack stack = pContext.getItemInHand();
        if (this.hasCustomColor(stack)) {
            BlockState state = pContext.getLevel().getBlockState(pContext.getClickedPos());
            if (state.getBlock() instanceof CauldronBlock) {
                int level = state.getValue(BlockStateProperties.LEVEL);
                if (level > 0) {
                    if (!pContext.getLevel().isClientSide()) {
                        this.clearColor(stack);
                        pContext.getLevel().getBlockState(pContext.getClickedPos()).setValue(BlockStateProperties.LEVEL, level-1);
                        Objects.requireNonNull(pContext.getPlayer()).awardStat(Stats.CLEAN_ARMOR);
                    }
                    return InteractionResult.SUCCESS;
                }
            }
        }
        return InteractionResult.PASS;
    }

    /*
    @Override
    public boolean hasOverlay(ItemStack stack) {
        return this.getArmorMaterial() == ModItems.RUBBER_MATERIAL || getColor(stack) != 0xFFFFFF;
    }
     */

    @Override
    public @Nullable String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {

        String overlay_1 = "misty_world:textures/models/armor/rubber_layer_1_overlay.png";
        String overlay_2 = "misty_world:textures/models/armor/rubber_layer_2_overlay.png";

        if (entity instanceof AbstractClientPlayer) {
            boolean legs = slot == EquipmentSlot.LEGS;
            if (type != null) return legs ? overlay_2 : overlay_1;
            boolean alex = ((AbstractClientPlayer)entity).getModelName().equals("slim");
            return legs ? legginsTex : alex ? thinTex : thickTex;
        }
        return null;
    }

    /*
    public static Model getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot slot, HumanoidModel<?> _default) {
        if (entityLiving instanceof AbstractClientPlayer) {
            boolean alex = ((AbstractClientPlayer)entityLiving).getModelName().equals("slim");
            boolean legs = slot == EquipmentSlot.LEGS;
            return legs ? ModelSuit.leggins : alex ? ModelSuit.thin : ModelSuit.thick;
        }
        return null;
    }
     */
}
