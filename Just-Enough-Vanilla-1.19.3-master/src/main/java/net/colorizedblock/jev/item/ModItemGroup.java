package net.colorizedblock.jev.item;

import net.colorizedblock.jev.JustEnoughVanilla;
import net.colorizedblock.jev.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup JEV;

    public static void registerItemGroups(){
        JEV = FabricItemGroup.builder(new Identifier(JustEnoughVanilla.MOD_ID, "jev"))
                .displayName(Text.translatable("itemgroup.jev"))
                .icon(() -> new ItemStack(ModBlocks.GRASSY_HOLLOW_OAK_LOG)).build();
    }

}
