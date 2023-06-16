package net.colorizedblock.jev.item;

import net.colorizedblock.jev.JustEnoughVanilla;
//import net.colorizedblock.jev.item.custom.BarkItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static final int knifeStrength = 1;
    private static final float knifeSpeed = 0.4f;
    public static final Item ORANGE = registerItem("orange",
            new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE)));

    public static final Item FLUTE = registerItem("flute",
            new Item(new FabricItemSettings().maxCount(1)));
    //region Barks
    public static final Item OAK_BARK = registerItem("oak_bark",
            new Item(new FabricItemSettings()));
    public static final Item BIRCH_BARK = registerItem("birch_bark",
            new Item(new FabricItemSettings()));
    public static final Item JUNGLE_BARK = registerItem("jungle_bark",
            new Item(new FabricItemSettings()));
    public static final Item DARK_OAK_BARK = registerItem("dark_oak_bark",
            new Item(new FabricItemSettings()));
    public static final Item MANGROVE_BARK = registerItem("mangrove_bark",
            new Item(new FabricItemSettings()));
    public static final Item ACACIA_BARK = registerItem("acacia_bark",
            new Item(new FabricItemSettings()));
    public static final Item SPRUCE_BARK = registerItem("spruce_bark",
            new Item(new FabricItemSettings()));
//endregion

    //region Knives
    public static final Item WOOD_KNIFE = registerItem("wood_knife",
            new SwordItem(ToolMaterials.WOOD, knifeStrength,knifeSpeed,new FabricItemSettings()));
    public static final Item STONE_KNIFE = registerItem("stone_knife",
            new SwordItem(ToolMaterials.STONE, knifeStrength,knifeSpeed,new FabricItemSettings()));
    public static final Item GOLD_KNIFE = registerItem("gold_knife",
            new SwordItem(ToolMaterials.GOLD, knifeStrength,knifeSpeed,new FabricItemSettings()));
    public static final Item IRON_KNIFE = registerItem("iron_knife",
            new SwordItem(ToolMaterials.IRON, knifeStrength,knifeSpeed,new FabricItemSettings()));
    public static final Item DIAMOND_KNIFE = registerItem("diamond_knife",
            new SwordItem(ToolMaterials.DIAMOND, knifeStrength,knifeSpeed,new FabricItemSettings()));
    public static final Item NETHERITE_KNIFE = registerItem("netherite_knife",
            new SwordItem(ToolMaterials.NETHERITE,knifeStrength,knifeSpeed,new FabricItemSettings()));
    //endregion

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(JustEnoughVanilla.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, ORANGE);
        addToItemGroup(ModItemGroup.JEV, FLUTE);
        //region Barks
        addToItemGroup(ModItemGroup.JEV, OAK_BARK);
        addToItemGroup(ModItemGroup.JEV, BIRCH_BARK);
        addToItemGroup(ModItemGroup.JEV, DARK_OAK_BARK);
        addToItemGroup(ModItemGroup.JEV, ACACIA_BARK);
        addToItemGroup(ModItemGroup.JEV, SPRUCE_BARK);
        addToItemGroup(ModItemGroup.JEV, MANGROVE_BARK);
        addToItemGroup(ModItemGroup.JEV, JUNGLE_BARK);
        //endregion

        //region Knives
        addToItemGroup(ItemGroups.COMBAT, WOOD_KNIFE);
        addToItemGroup(ItemGroups.COMBAT, GOLD_KNIFE);
        addToItemGroup(ItemGroups.COMBAT, STONE_KNIFE);
        addToItemGroup(ItemGroups.COMBAT, IRON_KNIFE);
        addToItemGroup(ItemGroups.COMBAT, DIAMOND_KNIFE);
        addToItemGroup(ItemGroups.COMBAT, NETHERITE_KNIFE);
        //endregion

    }

    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems(){
        JustEnoughVanilla.LOGGER.info("Registering Items For" + JustEnoughVanilla.MOD_ID);

        addItemsToItemGroup();
    }
}
