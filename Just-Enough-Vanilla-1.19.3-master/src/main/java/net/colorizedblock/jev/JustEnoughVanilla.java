package net.colorizedblock.jev;

import net.colorizedblock.jev.block.ModBlocks;
import net.colorizedblock.jev.event.UseBlockHandler;
import net.colorizedblock.jev.item.ModItemGroup;
import net.colorizedblock.jev.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JustEnoughVanilla implements ModInitializer {
	public static final String MOD_ID = "jev";
	public static final Logger LOGGER = LoggerFactory.getLogger("jev");
	public static final Identifier FLUTE1 = new Identifier("jev:flute1");
	public static SoundEvent FLUTE_1 = SoundEvent.of(FLUTE1);
	public static final Identifier FLUTE2 = new Identifier("jev:flute2");
	public static SoundEvent FLUTE_2 = SoundEvent.of(FLUTE2);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		UseBlockCallback.EVENT.register(new UseBlockHandler());
		Registry.register(Registries.SOUND_EVENT, JustEnoughVanilla.FLUTE1, FLUTE_1);
		Registry.register(Registries.SOUND_EVENT, JustEnoughVanilla.FLUTE2, FLUTE_2);

	}
}