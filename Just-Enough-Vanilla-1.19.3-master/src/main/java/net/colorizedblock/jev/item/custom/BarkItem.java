package net.colorizedblock.jev.item.custom;

import net.colorizedblock.jev.item.ModItems;
import net.colorizedblock.jev.item.custom.helper.Woods;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class BarkItem extends Item {
    public BarkItem(Settings settings) {
        super(settings);
    }


    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getWorld().getBlockState(context.getBlockPos()).getBlock() ==
                Blocks.STRIPPED_OAK_LOG)
            if (!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND
                    && context.getStack().getItem() == ModItems.OAK_BARK) {
                if (!Objects.requireNonNull(context.getPlayer()).isCreative()) {
                    context.getStack().setCount(context.getStack().getCount() - 1);
                }
                BlockState state = context.getWorld().getBlockState(context.getBlockPos());
                context.getWorld().setBlockState(context.getBlockPos(), Blocks.OAK_LOG.getStateWithProperties(state));
            }
        if(context.getWorld().getBlockState(context.getBlockPos()).getBlock() ==
                Blocks.STRIPPED_DARK_OAK_LOG)
            if (!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND
                    && context.getStack().getItem() == ModItems.DARK_OAK_BARK) {
                if (!Objects.requireNonNull(context.getPlayer()).isCreative()) {
                    context.getStack().setCount(context.getStack().getCount() - 1);
                }
                BlockState state = context.getWorld().getBlockState(context.getBlockPos());
                context.getWorld().setBlockState(context.getBlockPos(), Blocks.DARK_OAK_LOG.getStateWithProperties(state));
            }
        if(context.getWorld().getBlockState(context.getBlockPos()).getBlock() ==
                Blocks.STRIPPED_ACACIA_LOG)
            if (!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND
                    && context.getStack().getItem() == ModItems.ACACIA_BARK) {
                if (!Objects.requireNonNull(context.getPlayer()).isCreative()) {
                    context.getStack().setCount(context.getStack().getCount() - 1);
                }
                BlockState state = context.getWorld().getBlockState(context.getBlockPos());
                context.getWorld().setBlockState(context.getBlockPos(), Blocks.ACACIA_LOG.getStateWithProperties(state));
            }
        if(context.getWorld().getBlockState(context.getBlockPos()).getBlock() ==
                Blocks.STRIPPED_JUNGLE_LOG)
            if (!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND
                    && context.getStack().getItem() == ModItems.JUNGLE_BARK) {
                if (!Objects.requireNonNull(context.getPlayer()).isCreative()) {
                    context.getStack().setCount(context.getStack().getCount() - 1);
                }
                BlockState state = context.getWorld().getBlockState(context.getBlockPos());
                context.getWorld().setBlockState(context.getBlockPos(), Blocks.JUNGLE_LOG.getStateWithProperties(state));
            }
        if(context.getWorld().getBlockState(context.getBlockPos()).getBlock() ==
                Blocks.STRIPPED_SPRUCE_LOG)
            if (!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND
                    && context.getStack().getItem() == ModItems.SPRUCE_BARK) {
                if (!Objects.requireNonNull(context.getPlayer()).isCreative()) {
                    context.getStack().setCount(context.getStack().getCount() - 1);
                }
                BlockState state = context.getWorld().getBlockState(context.getBlockPos());
                context.getWorld().setBlockState(context.getBlockPos(), Blocks.SPRUCE_LOG.getStateWithProperties(state));
            }
        if(context.getWorld().getBlockState(context.getBlockPos()).getBlock() ==
                Blocks.STRIPPED_MANGROVE_LOG)
            if (!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND
                    && context.getStack().getItem() == ModItems.MANGROVE_BARK) {
                if (!Objects.requireNonNull(context.getPlayer()).isCreative()) {
                    context.getStack().setCount(context.getStack().getCount() - 1);
                }
                BlockState state = context.getWorld().getBlockState(context.getBlockPos());
                context.getWorld().setBlockState(context.getBlockPos(), Blocks.MANGROVE_LOG.getStateWithProperties(state));
            }
        if(context.getWorld().getBlockState(context.getBlockPos()).getBlock() ==
                Blocks.STRIPPED_BIRCH_LOG)
            if (!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND
                    && context.getStack().getItem() == ModItems.BIRCH_BARK) {
                if (!Objects.requireNonNull(context.getPlayer()).isCreative()) {
                    context.getStack().setCount(context.getStack().getCount() - 1);
                }
                BlockState state = context.getWorld().getBlockState(context.getBlockPos());
                context.getWorld().setBlockState(context.getBlockPos(), Blocks.BIRCH_LOG.getStateWithProperties(state));
            }
        if(context.getWorld().getBlockState(context.getBlockPos()).getBlock() ==
                Blocks.STRIPPED_WARPED_STEM)
            if (!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND
                    && context.getStack().getItem() == ModItems.WARPED_BARK) {
                if (!Objects.requireNonNull(context.getPlayer()).isCreative()) {
                    context.getStack().setCount(context.getStack().getCount() - 1);
                }
                BlockState state = context.getWorld().getBlockState(context.getBlockPos());
                context.getWorld().setBlockState(context.getBlockPos(), Blocks.WARPED_STEM.getStateWithProperties(state));
            }
        if(context.getWorld().getBlockState(context.getBlockPos()).getBlock() ==
                Blocks.STRIPPED_CRIMSON_STEM)
            if (!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND
                    && context.getStack().getItem() == ModItems.CRIMSON_BARK) {
                if (!Objects.requireNonNull(context.getPlayer()).isCreative()) {
                    context.getStack().setCount(context.getStack().getCount() - 1);
                }
                BlockState state = context.getWorld().getBlockState(context.getBlockPos());
                context.getWorld().setBlockState(context.getBlockPos(), Blocks.CRIMSON_STEM.getStateWithProperties(state));
            }
        if(context.getWorld().getBlockState(context.getBlockPos()).getBlock() ==
                Blocks.STRIPPED_OAK_WOOD)
            if (!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND
                    && context.getStack().getItem() == ModItems.OAK_BARK) {
                if (!Objects.requireNonNull(context.getPlayer()).isCreative()) {
                    context.getStack().setCount(context.getStack().getCount() - 1);
                }
                BlockState state = context.getWorld().getBlockState(context.getBlockPos());
                context.getWorld().setBlockState(context.getBlockPos(), Blocks.OAK_WOOD.getStateWithProperties(state));
            }
        if(context.getWorld().getBlockState(context.getBlockPos()).getBlock() ==
                Blocks.STRIPPED_DARK_OAK_WOOD)
            if (!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND
                    && context.getStack().getItem() == ModItems.DARK_OAK_BARK) {
                if (!Objects.requireNonNull(context.getPlayer()).isCreative()) {
                    context.getStack().setCount(context.getStack().getCount() - 1);
                }
                BlockState state = context.getWorld().getBlockState(context.getBlockPos());
                context.getWorld().setBlockState(context.getBlockPos(), Blocks.DARK_OAK_WOOD.getStateWithProperties(state));
            }
        if(context.getWorld().getBlockState(context.getBlockPos()).getBlock() ==
                Blocks.STRIPPED_ACACIA_WOOD)
            if (!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND
                    && context.getStack().getItem() == ModItems.ACACIA_BARK) {
                if (!Objects.requireNonNull(context.getPlayer()).isCreative()) {
                    context.getStack().setCount(context.getStack().getCount() - 1);
                }
                BlockState state = context.getWorld().getBlockState(context.getBlockPos());
                context.getWorld().setBlockState(context.getBlockPos(), Blocks.ACACIA_WOOD.getStateWithProperties(state));
            }
        if(context.getWorld().getBlockState(context.getBlockPos()).getBlock() ==
                Blocks.STRIPPED_JUNGLE_WOOD)
            if (!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND
                    && context.getStack().getItem() == ModItems.JUNGLE_BARK) {
                if (!Objects.requireNonNull(context.getPlayer()).isCreative()) {
                    context.getStack().setCount(context.getStack().getCount() - 1);
                }
                BlockState state = context.getWorld().getBlockState(context.getBlockPos());
                context.getWorld().setBlockState(context.getBlockPos(), Blocks.JUNGLE_WOOD.getStateWithProperties(state));
            }
        if(context.getWorld().getBlockState(context.getBlockPos()).getBlock() ==
                Blocks.STRIPPED_SPRUCE_WOOD)
            if (!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND
                    && context.getStack().getItem() == ModItems.SPRUCE_BARK) {
                if (!Objects.requireNonNull(context.getPlayer()).isCreative()) {
                    context.getStack().setCount(context.getStack().getCount() - 1);
                }
                BlockState state = context.getWorld().getBlockState(context.getBlockPos());
                context.getWorld().setBlockState(context.getBlockPos(), Blocks.SPRUCE_WOOD.getStateWithProperties(state));
            }
        if(context.getWorld().getBlockState(context.getBlockPos()).getBlock() ==
                Blocks.STRIPPED_MANGROVE_WOOD)
            if (!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND
                    && context.getStack().getItem() == ModItems.MANGROVE_BARK) {
                if (!Objects.requireNonNull(context.getPlayer()).isCreative()) {
                    context.getStack().setCount(context.getStack().getCount() - 1);
                }
                BlockState state = context.getWorld().getBlockState(context.getBlockPos());
                context.getWorld().setBlockState(context.getBlockPos(), Blocks.MANGROVE_WOOD.getStateWithProperties(state));
            }
        if(context.getWorld().getBlockState(context.getBlockPos()).getBlock() ==
                Blocks.STRIPPED_BIRCH_WOOD)
            if (!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND
                    && context.getStack().getItem() == ModItems.BIRCH_BARK) {
                if (!Objects.requireNonNull(context.getPlayer()).isCreative()) {
                    context.getStack().setCount(context.getStack().getCount() - 1);
                }
                BlockState state = context.getWorld().getBlockState(context.getBlockPos());
                context.getWorld().setBlockState(context.getBlockPos(), Blocks.BIRCH_WOOD.getStateWithProperties(state));
            }
        if(context.getWorld().getBlockState(context.getBlockPos()).getBlock() ==
                Blocks.STRIPPED_WARPED_HYPHAE)
            if (!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND
                    && context.getStack().getItem() == ModItems.WARPED_BARK) {
                if (!Objects.requireNonNull(context.getPlayer()).isCreative()) {
                    context.getStack().setCount(context.getStack().getCount() - 1);
                }
                BlockState state = context.getWorld().getBlockState(context.getBlockPos());
                context.getWorld().setBlockState(context.getBlockPos(), Blocks.WARPED_HYPHAE.getStateWithProperties(state));
            }
        if(context.getWorld().getBlockState(context.getBlockPos()).getBlock() ==
                Blocks.STRIPPED_CRIMSON_HYPHAE)
            if (!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND
                    && context.getStack().getItem() == ModItems.CRIMSON_BARK) {
                if (!Objects.requireNonNull(context.getPlayer()).isCreative()) {
                    context.getStack().setCount(context.getStack().getCount() - 1);
                }
                BlockState state = context.getWorld().getBlockState(context.getBlockPos());
                context.getWorld().setBlockState(context.getBlockPos(), Blocks.CRIMSON_HYPHAE.getStateWithProperties(state));
            }


        return ActionResult.success(true);
    }
}