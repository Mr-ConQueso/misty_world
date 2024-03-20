package net.mrconqueso.misty_world.block.custom.state;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum MistyStoneType implements StringRepresentable {
    NORMAL("normal", 0),
    HOT_1("hot_1", 1),
    HOT_2("hot_2", 2),
    HOT_3("hot_3", 3);

    private static final MistyStoneType[] META_LOOKUP = new MistyStoneType[values().length];
    private final String name;
    private final int hot;

    private MistyStoneType(String name, int hot) {
        this.name = name;
        this.hot = hot;
    }

    public int getHot() {
        return this.hot;
    }

    @Override
    public String toString() {
        return this.getSerializedName();
    }

    @Override
    public @NotNull String getSerializedName() {
        return this.name;
    }
}
