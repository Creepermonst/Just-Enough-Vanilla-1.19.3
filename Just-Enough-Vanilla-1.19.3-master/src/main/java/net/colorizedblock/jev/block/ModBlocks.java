package net.colorizedblock.jev.block;

import net.colorizedblock.jev.JustEnoughVanilla;
import net.colorizedblock.jev.block.custom.ModStairsBlock;
import net.colorizedblock.jev.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block SMOOTH_MARBLE = registerBlock("smooth_marble",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool()), ModItemGroup.JEV);

    public static final Block SMOOTH_MARBLE_STAIRS = registerBlock("smooth_marble_stairs",
            new ModStairsBlock(ModBlocks.SMOOTH_MARBLE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool()), ModItemGroup.JEV);

    public static final Block MARBLE = registerBlock("marble",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool()), ModItemGroup.JEV);

    public static final Block CHISELED_MARBLE = registerBlock("chiseled_marble",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool()), ModItemGroup.JEV);

    public static final Block MARBLE_BLOCK = registerBlock("marble_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool()), ModItemGroup.JEV);

    public static final Block MARBLE_STAIRS = registerBlock("marble_stairs",
            new ModStairsBlock(ModBlocks.MARBLE_BLOCK.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool()), ModItemGroup.JEV);

    public static final Block MARBLE_SLAB = registerBlock("marble_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool()), ModItemGroup.JEV);

    public static final Block SMOOTH_MARBLE_SLAB = registerBlock("smooth_marble_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool()), ModItemGroup.JEV);


    public static final Block MARBLE_PILLAR = registerBlock("marble_pillar",
            new PillarBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool()), ModItemGroup.JEV);

    public static final Block MARBLE_BRICKS = registerBlock("marble_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool()), ModItemGroup.JEV);


    private static Block registerBlock(String name,Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(JustEnoughVanilla.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        Item item = Registry.register(Registries.ITEM, new Identifier(JustEnoughVanilla.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    public static void registerModBlocks(){
        JustEnoughVanilla.LOGGER.info("Registering Blocks For Mod" + JustEnoughVanilla.MOD_ID);
    }
}
