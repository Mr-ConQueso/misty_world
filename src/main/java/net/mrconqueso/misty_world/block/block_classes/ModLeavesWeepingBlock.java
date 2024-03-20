package net.mrconqueso.misty_world.block.block_classes;

public class ModLeavesWeepingBlock extends ModLeavesBlock {
    private final int leavesCount;
    public ModLeavesWeepingBlock(int bloomMonth, int spoilMonth, int leavesCount, Properties pProperties) {
        super(bloomMonth, spoilMonth, pProperties);
        this.leavesCount = leavesCount;
    }
}
