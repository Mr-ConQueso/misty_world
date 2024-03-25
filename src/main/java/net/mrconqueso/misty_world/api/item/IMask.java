package net.mrconqueso.misty_world.api.item;

import com.google.common.collect.Maps;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.util.ItemStackMap;
import org.joml.Vector2f;

import javax.annotation.Nonnull;
import java.util.HashMap;

public interface IMask {

    public static final HashMap<ItemStackMap, Vector2f> respirators = Maps.<ItemStackMap, Vector2f>newHashMap(/*new ItemStackMap(new ItemStack(Items.IRON_HELMET))*/);
    public static final HashMap<ItemStackMap, Integer> filters = Maps.<ItemStackMap, Integer>newHashMap();

    /**This method is called once per tick if the mask is being worn by a player.*/
    public default void onWornTick(ItemStack stack, Player player) {}

    /**This method is called when the mask is equipped by a player.*/
    public default void onEquippedMask(ItemStack stack, Player player) {}

    public static void onEquipped(ItemStack stack, Player player) {
        if (!stack.isEmpty() && stack.getItem() instanceof IMask) ((IMask)stack.getItem()).onEquippedMask(stack, player);
    }

    /**This method is called when the mask is unequipped by a player.*/
    public default void onUnequippedMask(ItemStack stack, Player player) {}

    public static void onUnequipped(ItemStack stack, Player player) {
        if (!stack.isEmpty() && stack.getItem() instanceof IMask) ((IMask)stack.getItem()).onUnequippedMask(stack, player);
    }

    /**Can this mask be placed in a mask slot.*/
    public default boolean canEquipMask(@Nonnull ItemStack stack, Entity player) {
        return !isMaskInHelmetSlot(player);
    }

    public static boolean canEquip(ItemStack stack, Entity player) {
        if (isMask(stack)) {
            if (stack.getItem() instanceof IMask) return ((IMask)stack.getItem()).canEquipMask(stack, player);
            else return !isMaskInHelmetSlot(player);
        } else return false;
    }

    /**Can this mask be removed from a mask slot.*/
    public default boolean canUnequipMask(ItemStack stack, Player player) {
        return true;
    }

    public static boolean canUnequip(ItemStack stack, Player player) {
        if (!stack.isEmpty() && stack.getItem() instanceof IMask) return ((IMask)stack.getItem()).canUnequipMask(stack, player);
        return true;
    }

    /**
     * Will mask automatically sync to client if a change is detected in its NBT or damage values?
     * Default is off, so override and set to true if you want to auto sync.
     * This sync is not instant, but occurs every 10 ticks (0.5 seconds).
     */
    public default boolean willAutoSync(ItemStack stack, Entity player) {
        return false;
    }

    public default boolean isRespirator() {
        return false;
    }

    public static boolean isRespirator(ItemStack stack) {
        return stack.isEmpty() ? false : stack.getItem() instanceof IMask ? ((IMask)stack.getItem()).isRespirator() : respirators.containsKey(new ItemStackMap());
    }

    public default boolean canEat() {
        return false;
    }

    public static boolean canEat(ItemStack stack) {
        if (stack.isEmpty()) return true;
        else if (stack.getItem() instanceof IMask) return ((IMask)stack.getItem()).canEat();
        else {
            ItemStackMap key = new ItemStackMap();
            if (!respirators.containsKey(key)) return true;
            else return respirators.get(key).y == 1;
        }
    }

    /**Returns the respirator impermeability in percent.*/
    public default float getImpermeability() {
        return 90; //85 for open
    }

    /**Returns the respirator impermeability in percent.*/
    public static float getImpermeability(ItemStack mask) {
        float i;
        if (mask.getItem() instanceof IMask) i = ((IMask)mask.getItem()).getImpermeability();
        else {
            ItemStackMap key = new ItemStackMap();
            if (!respirators.containsKey(key)) i = 0;
            else i = respirators.get(key).x;
        }
        int level = EnchantmentHelper.getEnchantmentLevel(Enchantments.RESPIRATION, (LivingEntity) mask.getEntityRepresentation());
        i += (100 - i) * level * 0.1F;
        return i;
    }
    /*
    public static boolean isMaskInSlot(Entity player) {
        return player instanceof Player && isMask(IMistCapaHandler.getHandler((Player)player).getMask());
    }

     */

    public static boolean isMaskInHelmetSlot(Entity player) {
        return player instanceof Player && isMask(((Player)player).getItemBySlot(EquipmentSlot.HEAD));
    }

    public static boolean isMask(ItemStack stack) {
        return !stack.isEmpty() && (stack.getItem() instanceof IMask || stack.getTag().get("filter") != null);
    }

    /**Returns the filter in the respirator.*/
    public static ItemStack getFilter(ItemStack stack) {
        CompoundTag tag = stack.getTag().getCompound("filter");
        return tag != null ? new ItemStack((ItemLike) tag) : ItemStack.EMPTY;
    }

    /**Returns the filtering depth of the current respirator in percent.*/
    public static float damageFilter(ItemStack mask, int damage) {
        ItemStack filter = getFilter(mask);
        if (!filter.isEmpty()) {
            int durability = getFilterDurability(filter);
            float filteringDepth = getFilteringDepth(filter);
            filteringDepth *= getImpermeability(mask)/100;
            if (durability == filter.getMaxDamage()) {
                damage += filter.getDamageValue();
                if (damage < durability) {
                    filter.setDamageValue(damage);
                    mask.getTag().put("filter", filter.serializeNBT());
                    mask.getTag().putInt("filterDurability", damage);
                } else {
                    mask.getTag().remove("filter");
                    mask.getTag().remove("filterDurability");
                }
            } else {
                damage += mask.getTag().getInt("filterDurability");
                if (damage <= durability) mask.getTag().putInt("filterDurability", damage);
                else {
                    mask.getTag().remove("filter");
                    mask.getTag().remove("filterDurability");
                }
            }
            //mistCapa.setMaskChanged(true, false);
            return filteringDepth;
        }
        return 0;
    }

    /**Returns the filter durability.*/
    public static int getFilterDurability(ItemStack filter) {
        if (filter.isDamageableItem()) return filter.getMaxDamage();
        else {
            ItemStackMap key = new ItemStackMap();
            return !filters.isEmpty() && filters.containsKey(key) ? filters.get(key) : 1000;
        }
    }

    /**Returns the filtering depth of current filter.*/
    public static float getFilteringDepth(ItemStack filter) {
        if (filter.getItem() instanceof IFilter) return ((IFilter)filter.getItem()).getFilteringDepth();
        else return filter.hasTag() ? filter.getTag().getFloat("filteringDepth") : 0;
    }
}