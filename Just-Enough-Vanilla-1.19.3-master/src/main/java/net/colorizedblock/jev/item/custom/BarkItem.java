package net.colorizedblock.jev.item.custom;

import net.colorizedblock.jev.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

import java.util.HashMap;
import java.util.Objects;

public class BarkItem extends Item {
    public BarkItem(Settings settings) {
        super(settings);
        Woods.put(Blocks.STRIPPED_OAK_LOG.getDefaultState().getBlock(), new net.colorizedblock.jev.item.custom.helper.Woods(ModItems.OAK_BARK, Blocks.OAK_LOG.getDefaultState()));
        Woods.put(Blocks.STRIPPED_BIRCH_LOG.getDefaultState().getBlock(), new net.colorizedblock.jev.item.custom.helper.Woods(ModItems.BIRCH_BARK, Blocks.BIRCH_LOG.getDefaultState()));
    }

    private HashMap<Block, net.colorizedblock.jev.item.custom.helper.Woods> Woods = new HashMap<>();



    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient && context.getHand() == Hand.MAIN_HAND
                && context.getStack().getItem() == ModItems.OAK_BARK
                && Woods.containsKey(context.getWorld().getBlockState(context.getBlockPos()).getBlock())){
            if(!Objects.requireNonNull(context.getPlayer()).isCreative());
//                context.getStack().setCount( context.getStack().getCount()-1);
//                    context.getWorld().setBlockState(context.getBlockPos(), (Woods) Woods.get(context.getWorld().getBlockState(context.getBlockPos()).getBlock())
        }
        System.out.println(Woods.get(context.getWorld().getBlockState(context.getBlockPos()).getBlock()).toString());
        return super.useOnBlock(context);
    }
}
