package net.jericko.accessories.datagen;

import net.jericko.accessories.block.ModBlocks;
import net.jericko.accessories.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.TEST_BLOCK.get());

        add(ModBlocks.TEST_ORE.get(), (block) -> createOreDrop(ModBlocks.TEST_ORE.get(), ModItems.TEST_RAW.get()));
        add(ModBlocks.DEEPSLATE_TEST_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_TEST_ORE.get(), ModItems.TEST_RAW.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
