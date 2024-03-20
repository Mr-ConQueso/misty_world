package net.mrconqueso.misty_world.block.custom.state;

import net.minecraft.util.StringRepresentable;

public enum FurnaceState implements StringRepresentable {
    UNLIT("unlit"),
    LIT("lit"),
    WARM("warm"),
    CLOSED("closed");

    private final String furnaceStateName;

    FurnaceState(String name) {
        this.furnaceStateName = name;
    }

    @Override
    public String toString() {
        return this.getSerializedName();
    }

    @Override
    public String getSerializedName() {
        return this.furnaceStateName;
    }
}
