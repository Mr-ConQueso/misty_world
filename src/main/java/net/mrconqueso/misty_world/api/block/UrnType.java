package net.mrconqueso.misty_world.api.block;

import net.minecraft.util.StringRepresentable;

public enum UrnType implements StringRepresentable {
    ONE("one"),
    TWO("two"),
    THREE("three"),
    FOUR("four"),
    FIVE("five"),
    SIX("six"),
    SEVEN("seven"),
    EIGHT("eight"),
    NINE("nine"),
    TEN("ten"),
    ELEVEN("eleven"),
    TWELVE("twelve");

    private final String urnTypeName;

    UrnType(String name) {
        this.urnTypeName = name;
    }

    @Override
    public String toString() {
        return this.getSerializedName();
    }

    @Override
    public String getSerializedName() {
        return this.urnTypeName;
    }
}
