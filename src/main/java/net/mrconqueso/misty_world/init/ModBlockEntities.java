package net.mrconqueso.misty_world.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.block.entity.FoggyStoneFurnaceBlockEntity;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MistyWorld.MOD_ID);
    public static final RegistryObject<BlockEntityType<FoggyStoneFurnaceBlockEntity>> FOGGY_STONE_FURNACE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("foggy_stone_furnace_block_entity", () -> BlockEntityType.Builder.of(FoggyStoneFurnaceBlockEntity::new,
                    ModBlocks.FOGGY_STONE_FURNACE.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}