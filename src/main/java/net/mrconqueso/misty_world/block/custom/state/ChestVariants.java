package net.mrconqueso.misty_world.block.custom.state;

import net.minecraft.resources.ResourceLocation;
import net.mrconqueso.misty_world.MistyWorld;

public enum ChestVariants {
    NIOBIUM_NORMAL("niobium_normal"),
    NIOBIUM_TRAPPED("niobium_trapped", true);

    private final String location;

    ChestVariants(String name, boolean trapped) {
        this.location = name + "_" + (trapped ? "trapped" : "normal");
    }

    ChestVariants(String name) {
        this(name, false);
    }

    public ResourceLocation getSingle() {
        return new ResourceLocation(MistyWorld.MOD_ID, "entity/chest/" + this.location);
    }

    public ResourceLocation getRight() {
        return new ResourceLocation(MistyWorld.MOD_ID, "entity/chest/" + this.location + "_right");
    }

    public ResourceLocation getLeft() {
        return new ResourceLocation(MistyWorld.MOD_ID, "entity/chest/" + this.location + "_left");
    }
}
