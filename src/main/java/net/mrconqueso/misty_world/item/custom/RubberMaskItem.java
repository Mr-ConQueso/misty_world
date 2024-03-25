package net.mrconqueso.misty_world.item.custom;

import net.minecraft.world.item.ArmorMaterial;
import net.mrconqueso.misty_world.item.item_classes.ModDyableRubberArmorItem;

public class RubberMaskItem extends ModDyableRubberArmorItem {
    public final float impermeability;
    private final boolean canEat;
    public RubberMaskItem(float impermeability, boolean canEat, ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
        this.impermeability = impermeability;
        this.canEat = canEat;
    }
}
