package net.colorizedblock.jev.item;

import net.colorizedblock.jev.JustEnoughVanilla;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ORANGE = registerItem("orange",
            new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(JustEnoughVanilla.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, ORANGE);

    }

    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }


    public static void registerModItems(){
        JustEnoughVanilla.LOGGER.info("Registering Items For" + JustEnoughVanilla.MOD_ID);

        addItemsToItemGroup();
    }
}
