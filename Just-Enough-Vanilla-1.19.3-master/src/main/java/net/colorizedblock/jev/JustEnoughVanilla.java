package net.colorizedblock.jev;

import net.colorizedblock.jev.block.ModBlocks;
import net.colorizedblock.jev.item.ModItemGroup;
import net.colorizedblock.jev.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JustEnoughVanilla implements ModInitializer {
	public static final String MOD_ID = "jev";
	public static final Logger LOGGER = LoggerFactory.getLogger("jev");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}