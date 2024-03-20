package net.mrconqueso.misty_world.api.blockentity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.block.entity.ModChestBlockEntity;
import net.mrconqueso.misty_world.block.entity.ModTrappedChestBlockEntity;
import net.mrconqueso.misty_world.init.ModBlocks;

public class ModBlockEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MistyWorld.MOD_ID);

    public static final RegistryObject<BlockEntityType<ModChestBlockEntity>> CHEST = BLOCK_ENTITY_TYPES.register("chest",
            () -> BlockEntityType.Builder.of(ModChestBlockEntity::new, ModBlocks.NIOBIUM_CHEST.get()).build(null));
    public static final RegistryObject<BlockEntityType<ModTrappedChestBlockEntity>> TRAPPED_CHEST = BLOCK_ENTITY_TYPES.register("trapped_chest",
            () -> BlockEntityType.Builder.of(ModTrappedChestBlockEntity::new, ModBlocks.NIOBIUM_TRAPPED_CHEST.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITY_TYPES.register(eventBus);
    }
}
