package net.colorizedblock.jev.item.custom.helper;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;

public class Woods {
    private Item item;
    private BlockState blockState;

    public Woods(Item item, BlockState defaultState) {
        this.item = item;
        this.blockState = defaultState;
    }
}