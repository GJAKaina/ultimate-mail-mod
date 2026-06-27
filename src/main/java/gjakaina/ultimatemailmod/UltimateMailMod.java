package gjakaina.ultimatemailmod;

import gjakaina.ultimatemailmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UltimateMailMod implements ModInitializer {
	public static final String MOD_ID = "ultimate-mail-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}