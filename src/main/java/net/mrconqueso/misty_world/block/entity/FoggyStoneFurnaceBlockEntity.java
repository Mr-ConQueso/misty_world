package net.mrconqueso.misty_world.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.mrconqueso.misty_world.block.custom.state.FurnaceState;
import net.mrconqueso.misty_world.init.ModBlockEntities;
import net.mrconqueso.misty_world.init.ModBlocks;
import net.mrconqueso.misty_world.block.custom.FoggyStoneFurnaceBlock;
import net.mrconqueso.misty_world.init.ModItems;
import net.mrconqueso.misty_world.screen.FoggyStoneFurnaceMenu;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Math;

public class FoggyStoneFurnaceBlockEntity extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(4);
    private static final int INPUT_SLOT = 0;
    private static final int OUTPUT_SLOT = 3;

    private static final int[] SLOTS_INPUT = new int[] { 0, 1 };
    private static final int[] SLOTS_OUTPUT = new int[] { 0, 1, 2, 3 };
    private static final int[] SLOTS_LEFT = new int[] { 0 };
    private static final int[] SLOTS_RIGHT = new int[] { 1 };
    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 78;
    private int[] furnaceBurnTime = new int[] { 0, 0 };
    private int[] currentItemBurnTime = new int[] { 0, 0 };
    private float[] cookTime = new float[] { 0, 0 };
    private int[] totalCookTime = new int[] { 0, 0 };
    public int[] ashProgress = new int[] { 0, 0 };
    private boolean close = false;
    private boolean signal = false;

    private float[] temperature = new float[11];
    private static final float[] leftFactor = new float[] { 0.84F, 0.91F, 0.96F, 0.99F, 1.0F, 0.99F, 0.96F, 0.91F, 0.84F, 0.74F, 0.63F };
    private static final float[] rightFactor = new float[] { 0.63F, 0.74F, 0.84F, 0.91F, 0.96F, 0.99F, 1.0F, 0.99F, 0.96F, 0.91F, 0.84F };
    private static final int[] leftLimit = new int[] { 2700, 2850, 2950, 3000, 3000, 3000, 2950, 2850, 2700, 2500, 2250 };
    private static final int[] rightLimit = new int[] { 2250, 2500, 2700, 2850, 2950, 3000, 3000, 3000, 2950, 2850, 2700 };
    private static final int[] mainLimit = new int[] { 2700, 2850, 2950, 3000, 3000, 3000, 3000, 3000, 2950, 2850, 2700 };

    private static final int radius = 8;
    public static final int ashTime = 1200;
    public static final int burnTemp = 300;

    public FoggyStoneFurnaceBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.FOGGY_STONE_FURNACE_BLOCK_ENTITY.get(), pPos, pBlockState);

        this.data = new ContainerData() {
            @Override
            public int get(int pIndex) {
                return switch (pIndex) {
                    case 0 -> FoggyStoneFurnaceBlockEntity.this.progress;
                    case 1 -> FoggyStoneFurnaceBlockEntity.this.maxProgress;
                    default ->  0;
                };
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch (pIndex) {
                    case 0 -> FoggyStoneFurnaceBlockEntity.this.progress = pValue;
                    case 1 -> FoggyStoneFurnaceBlockEntity.this.maxProgress = pValue;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    public void fire() {
        temperature[2] = Math.max(100, temperature[2]);
        temperature[3] = Math.max(150, temperature[3]);
        temperature[4] = Math.max(250, temperature[4]);
        temperature[5] = Math.max(300, temperature[5]);
        temperature[6] = Math.max(250, temperature[6]);
        temperature[7] = Math.max(150, temperature[7]);
        temperature[8] = Math.max(100, temperature[8]);
    }

    public float getMaxTemperature() {
        float t = 0;
        for (int i = 4; i <= 6; ++i) {
            if (temperature[i] > t) t = temperature[i];
        }
        return t;
    }

    private float getNormalTemperature() {
        return 2500;
    }

    private float getTemperature(int index) {
        return index == 0 ? getLeftTemperature() : getRightTemperature();
    }

    private float getLeftTemperature() {
        float t = 0;
        for (int i = 0; i < radius; ++i) t += temperature[i];
        return t / radius;
    }

    private float getRightTemperature() {
        float t = 0;
        for (int i = temperature.length - radius; i < temperature.length; ++i) t += temperature[i];
        return t / radius;
    }

    private void heatLeft(float amount) {
        for (int i = 0; i < temperature.length; ++i) {
            temperature[i] += amount * leftFactor[i];
            int limit = currentItemBurnTime[1] > 0 ? mainLimit[i] : leftLimit[i];
            if (temperature[i] > limit) temperature[i] = limit;
        }
    }

    private void heatRight(float amount) {
        for (int i = 0; i < temperature.length; ++i) {
            temperature[i] += amount * rightFactor[i];
            int limit = currentItemBurnTime[0] > 0 ? mainLimit[i] : rightLimit[i];
            if (temperature[i] > limit) temperature[i] = limit;
        }
    }

    private void heat(int index, float amount) {
        if (index == 0) heatLeft(amount);
        else heatRight(amount);
    }

    private void cool(float amount) {
        for (int i = 0; i < temperature.length; ++i) {
            temperature[i] -= amount;
            if (temperature[i] < 0) temperature[i] = 0;
        }
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap) {
        if (cap == ForgeCapabilities.ITEM_HANDLER) {
            return lazyItemHandler.cast();
        }
        return super.getCapability(cap);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("block.misty_world.foggy_stone_furnace.name");
        //return this.hasCustomName() ? this.customName : "block.misty_world.foggy_stone_furnace.name";
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int containerId, Inventory inventory, Player player) {
        return new FoggyStoneFurnaceMenu(containerId, inventory, this, this.data);
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.put("inventory", itemHandler.serializeNBT());
        pTag.putInt("foggy_stone_furnace.progress", progress);

        for (int i : SLOTS_INPUT) {
            pTag.putInt("BurnTime_" + i, this.furnaceBurnTime[i]);
            pTag.putInt("ItemBurnTime_" + i, this.currentItemBurnTime[i]);
            pTag.putFloat("CookTime_" + i, this.cookTime[i]);
            pTag.putInt("CookTimeTotal_" + i, this.totalCookTime[i]);
            pTag.putInt("AshProgress_" + i, this.ashProgress[i]);
            pTag.putBoolean("Close", this.close);
            pTag.putBoolean("Signal", this.signal);
        }
        for (int i = 0; i < this.temperature.length; ++i) {
            pTag.putFloat("Temperature_" + i, this.temperature[i]);
        }
        //if (this.hasCustomName()) pTag.putString("CustomName", this.customName);

        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag pTag) {
        itemHandler.deserializeNBT(pTag.getCompound("inventory"));
        progress = pTag.getInt("foggy_stone_furnace.progress");

        for (int i : SLOTS_INPUT) {
            this.furnaceBurnTime[i] = pTag.getInt("BurnTime_" + i);
            this.currentItemBurnTime[i] = pTag.getInt("ItemBurnTime_" + i);
            this.cookTime[i] = pTag.getFloat("CookTime_" + i);
            this.totalCookTime[i] = pTag.getInt("CookTimeTotal_" + i);
            this.ashProgress[i] = pTag.getInt("AshProgress_" + i);
            this.close = pTag.getBoolean("Close");
            this.signal = pTag.getBoolean("Signal");
        }
        for (int i = 0; i < this.temperature.length; ++i) {
            this.temperature[i] = pTag.getFloat("Temperature_" + i);
        }
        //if (pTag.contains("CustomName", 8)) this.customName = compound.getString("CustomName");

        super.load(pTag);
    }

    public void tick(Level pLevel, BlockPos pBlockPos, BlockState pState) {
        if (hasRecipe()) {
            increaseCraftingProgress();
            setChanged(pLevel, pBlockPos, pState);

            if (hasProgressFinished()) {
                craftItem();
                resetProgress();
            }
        } else {
            resetProgress();
        }

        if (!this.stateCheck) {
            this.updateStatus(pLevel, pBlockPos, pState);
            this.stateCheck = true;
        }
        if (!pLevel.isClientSide()) {
            boolean burnCheck = this.isLeftBurning() || this.isRightBurning();
            boolean tempCheck = this.getMaxTemperature() >= burnTemp;
            boolean change = false;
            int comp = this.getComparatorOutput();

            for (int i : SLOTS_INPUT) {
                if (this.isBurning(i)) {
                    this.furnaceBurnTime[i] -= !this.close && this.ashProgress[i] < ashTime ? 1 : this.currentItemBurnTime[i] / 100;
                    ++this.ashProgress[i];
                    this.heat(i, 3);
                }
                if (this.ashProgress[i] >= ashTime) putAsh(i);
            }
            if (this.getMaxTemperature() >= burnTemp) {
                if (!this.close) {
                    for (int i : SLOTS_INPUT) {
                        if (!this.isBurning(i) && this.ashProgress[i] < ashTime) {
                            ItemStack fuelStack = itemHandler.getStackInSlot(i);
                            //this.furnaceBurnTime[i] = FurnaceBlockEntity.get(fuelStack);
                            this.currentItemBurnTime[i] = this.furnaceBurnTime[i];
                            if (this.isBurning(i)) {
                                change = true;
                                if (!fuelStack.isEmpty()) {
                                    Item fuel = fuelStack.getItem();
                                    fuelStack.shrink(1);
                                    if (fuelStack.isEmpty()) itemHandler.setStackInSlot(i, fuel.getCraftingRemainingItem(fuelStack));
                                }
                            }
                        }
                    }
                }
                for (int i : SLOTS_INPUT) {
                    /*
                    if ((this.close || this.currentItemBurnTime[i] == 0) && this.canSmelt(i)) {
                        float t = this.getTemperature(i);
                        if (t > burnTemp + 10) {
                            this.cookTime[i] += t / this.getNormalTemperature();
                            if (this.cookTime[i] >= this.totalCookTime[i]) {
                                this.cookTime[i] = 0;
                                this.totalCookTime[i] = this.getCookTime(itemHandler.getStackInSlot(i));
                                this.smeltItem(i);
                                change = true;
                            }
                        }
                    } else this.cookTime[i] = 0;

                     */
                }
            } else {
                for (int i : SLOTS_INPUT) {
                    if (this.cookTime[i] > 0) this.cookTime[i] = Math.clamp(this.cookTime[i] - 2, 0, this.totalCookTime[i]);
                }
            }

            this.cool(this.close || this.isLeftBurning() || this.isRightBurning() ? 1 : 2);

            if ((burnCheck != this.isLeftBurning() || this.isRightBurning()) || tempCheck != (this.getMaxTemperature() >= burnTemp)) {
                change = true;
                updateStatus(pLevel, pBlockPos, pState);
            }
            if (comp != this.getComparatorOutput()) {
                change = true;
                //FoggyStoneFurnaceBlock.checkSingal(pLevel, pBlockPos, pState);
            }
        }
    }

    public void updateStatus(Level pLevel, BlockPos pBlockPos, BlockState pState) {
        boolean burn = this.getMaxTemperature() >= burnTemp;
        int status = this.close ? burn ? 4 : 0 : this.isLeftBurning() || this.isRightBurning() ? 3 : burn ? 2 : 1;
        FurnaceState intToState = switch (status) {
            case 0 -> FurnaceState.UNLIT;
            case 1 -> FurnaceState.LIT;
            case 2 -> FurnaceState.WARM;
            case 3 -> FurnaceState.CLOSED;
            default -> throw new IllegalStateException("Unexpected value: " + status);
        };
        pState.setValue(FoggyStoneFurnaceBlock.STATE, intToState);
    }

    /*
    @OnlyIn(Dist.CLIENT)
    public static int getStatus(IItemHandler inventory) {
        boolean burn = getTemp(inventory) >= burnTemp;
        return !isClose(inventory) ? burn ? 4 : 0 : isBurning(inventory) ? 3 : burn ? 2 : 1;
    }


    public int getCookTime(ItemStack stack) {
        return 200;
    }

    private boolean canSmelt(int index) {
        if (itemHandler.getStackInSlot(index).isEmpty()) return false;
        else {
            ItemStack stack = FurnaceRecipes.instance().getSmeltingResult(this.furnaceItemStacks.get(index));
            if (stack.isEmpty()) return false;
            else {
                ItemStack outStack = itemHandler.getStackInSlot(index + 2);
                if (outStack.isEmpty()) return true;
                else if (!outStack.equals(stack)) return false;
                else if (outStack.getCount() + stack.getCount() <= this.getInventoryStackLimit() &&
                        outStack.getCount() + stack.getCount() <= outStack.getMaxStackSize()) return true;
                else return outStack.getCount() + stack.getCount() <= stack.getMaxStackSize();
            }
        }
    }

     */

    public void smeltItem(int index) {
        /*
        if (this.canSmelt(index)) {
            ItemStack itemstack = itemHandler.getStackInSlot(index);
            ItemStack itemstack1 = FurnaceRecipes.instance().getSmeltingResult(itemstack);
            ItemStack itemstack2 = itemHandler.getStackInSlot(index + 2);
            if (itemstack2.isEmpty()) {
                itemHandler.setStackInSlot(index + 2, itemstack1.copy());
            } else if (itemstack2.getItem() == itemstack1.getItem()) {
                itemstack2.grow(itemstack1.getCount());
            }
            itemstack.shrink(1);
        }

         */
    }

    public void putAsh(int index) {
        ItemStack out = itemHandler.getStackInSlot(index + 2);
        if (out.isEmpty()) {
            itemHandler.setStackInSlot(index + 2, new ItemStack(ModItems.ASH.get()));
            this.ashProgress[index] = 0;
        } else if (out.getItem() == ModItems.ASH.get() && out.getCount() < 16) {
            out.grow(1);
            this.ashProgress[index] = 0;
        } else this.ashProgress[index] = ashTime;
    }

    public boolean hasSignal() {
        return signal;
    }

    public void setSignal(boolean signal) {
        this.signal = signal;
    }

    private boolean isLeftBurning() {
        return this.furnaceBurnTime[0] > 0;
    }

    private boolean isRightBurning() {
        return this.furnaceBurnTime[1] > 0;
    }

    public boolean isBurning(int index) {
        return index == 0 ? isLeftBurning() : isRightBurning();
    }

    /*
    @OnlyIn(Dist.CLIENT)
    public static boolean isBurning(ItemStackHandler inventory) {
        return inventory.getSlots() > 0 || inventory.getField(1) > 0;
    }

    @OnlyIn(Dist.CLIENT)
    public static boolean isBurning(ItemStackHandler inventory, int index) {
        return inventory.getField(index) > 0;
    }
    @OnlyIn(Dist.CLIENT)
    public static int getTemp(IItemHandler inventory) {
        float t = 0;
        for (int i = 4; i <= 6; ++i) {
            if (inventory.getField(i + 10) > t) t = inventory.getField(i + 10);
        }
        return (int)t;
    }

    @OnlyIn(Dist.CLIENT)
    public int getClientComparatorOutput(ItemStackHandler inventory) {
        float t = 0;
        for (int i = 0; i < temperature.length; ++i) {
            t += inventory.getField(i + 10);
        }
        return comparatorMath(t);
    }

    @OnlyIn(Dist.CLIENT)
    public static int getTemp(ItemStackHandler inventory, int index) {
        return inventory.getField(index + 10);
    }

    @OnlyIn(Dist.CLIENT)
    public static boolean isClose(ItemStackHandler inventory) {
        return inventory.getField(21) == 0;
    }

     */

    public boolean isClose() {
        return this.close;
    }

    public void setClose(boolean close) {
        this.close = close;
    }

    public int getComparatorOutput() {
        float t = 0;
        for (int i = 0; i < temperature.length; ++i) {
            t += temperature[i];
        }
        return comparatorMath(t);
    }

    private int comparatorMath(float temp) {
        temp -= 2000;
        return Math.max((int)Math.ceil(temp * 16 / 30000), 0);
    }

    private boolean stateCheck = false;

    private void resetProgress() {
        progress = 0;
    }

    private void craftItem() {
        ItemStack result = new ItemStack(Items.GOLD_INGOT, 1);
        this.itemHandler.extractItem(INPUT_SLOT, 1, false);

        this.itemHandler.setStackInSlot(OUTPUT_SLOT, new ItemStack(result.getItem(),
                this.itemHandler.getStackInSlot(OUTPUT_SLOT).getCount() + result.getCount()));
    }

    private boolean hasRecipe() {
        boolean hasCraftingItem = this.itemHandler.getStackInSlot(INPUT_SLOT).getItem() == ModBlocks.GOLD_ORE.get().asItem();
        ItemStack result = new ItemStack(Items.GOLD_INGOT);

        return hasCraftingItem && canInsertAmountIntoOutputSlot(result.getCount()) && canInsertItemIntoOutputSlot(result.getItem());
    }

    private boolean canInsertItemIntoOutputSlot(Item item) {
        return this.itemHandler.getStackInSlot(OUTPUT_SLOT).isEmpty() || this.itemHandler.getStackInSlot(OUTPUT_SLOT).is(item);
    }

    private boolean canInsertAmountIntoOutputSlot(int count) {
        return this.itemHandler.getStackInSlot(OUTPUT_SLOT).getCount() + count <= this.itemHandler.getStackInSlot(OUTPUT_SLOT).getMaxDamage();
    }

    private boolean hasProgressFinished() {
        return progress >= maxProgress;
    }

    private void increaseCraftingProgress() {
        progress++;
    }
}
