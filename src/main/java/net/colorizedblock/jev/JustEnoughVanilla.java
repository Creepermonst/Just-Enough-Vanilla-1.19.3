package net.colorizedblock.jev;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JustEnoughVanilla implements ModInitializer {
	public static final String MOD_ID = "jev";
	public static final Logger LOGGER = LoggerFactory.getLogger("jev");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}