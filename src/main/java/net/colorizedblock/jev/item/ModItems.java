package net.colorizedblock.jev.item;

import net.colorizedblock.jev.JustEnoughVanilla;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ORANGE = registerItem("orange",
            new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE)));
    private static final int knifeStrength = 1;
    private static final float knifeSpeed = 0.4f;


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

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(JustEnoughVanilla.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, ORANGE);
        addToItemGroup(ModItemGroup.JEV, WOOD_KNIFE);
        addToItemGroup(ModItemGroup.JEV, GOLD_KNIFE);
        addToItemGroup(ModItemGroup.JEV, STONE_KNIFE);
        addToItemGroup(ModItemGroup.JEV, IRON_KNIFE);
        addToItemGroup(ModItemGroup.JEV, DIAMOND_KNIFE);
        addToItemGroup(ModItemGroup.JEV, NETHERITE_KNIFE);

    }

    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }


    public static void registerModItems(){
        JustEnoughVanilla.LOGGER.info("Registering Items For" + JustEnoughVanilla.MOD_ID);

        addItemsToItemGroup();
    }
}
