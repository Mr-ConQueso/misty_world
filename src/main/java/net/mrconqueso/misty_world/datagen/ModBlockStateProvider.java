package net.mrconqueso.misty_world.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrconqueso.misty_world.MistyWorld;
import net.mrconqueso.misty_world.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MistyWorld.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        logBlock(((RotatedPillarBlock) ModBlocks.ASPEN_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.ASPEN_WOOD.get()), blockTexture(ModBlocks.ASPEN_LOG.get()), blockTexture(ModBlocks.ASPEN_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ASPEN_LOG.get()), blockTexture(ModBlocks.STRIPPED_ASPEN_LOG.get()),
                new ResourceLocation(MistyWorld.MOD_ID, "block/stripped_aspen_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ASPEN_WOOD.get()), blockTexture(ModBlocks.STRIPPED_ASPEN_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_ASPEN_LOG.get()));

        blockItem(ModBlocks.ASPEN_LOG);
        blockItem(ModBlocks.ASPEN_WOOD);
        blockItem(ModBlocks.STRIPPED_ASPEN_LOG);
        blockItem(ModBlocks.STRIPPED_ASPEN_WOOD);

        blockWithItem(ModBlocks.ASPEN_PLANKS);
        leavesBlock(ModBlocks.ASPEN_LEAVES);

        blockWithItem(ModBlocks.SALT_ORE);
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));

    }
    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(MistyWorld.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
