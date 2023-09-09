package net.colorizedblock.jev.event;

import net.colorizedblock.jev.item.ModItems;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;

public class UseBlockHandler implements UseBlockCallback {
    @Override
    public ActionResult interact(PlayerEntity player, World world, Hand hand, BlockHitResult hitResult) {
        if(world.getBlockState(hitResult.getBlockPos()).getBlock() == Blocks.JUNGLE_LOG ||world.getBlockState(hitResult.getBlockPos()).getBlock() == Blocks.JUNGLE_WOOD && !world.isClient() && player.isHolding(Items.IRON_AXE)){
            player.giveItemStack(new ItemStack(ModItems.JUNGLE_BARK, 1));
        }
        return ActionResult.PASS;
    }
}
