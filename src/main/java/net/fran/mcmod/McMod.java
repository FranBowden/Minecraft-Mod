package net.fran.mcmod;

import net.fabricmc.api.ModInitializer;

import net.fran.mcmod.block.ModBlocks;
import net.fran.mcmod.item.ModItemGroups;
import net.fran.mcmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class McMod implements ModInitializer {
	public static final String MOD_ID = "mcmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registeredModBlocks();
		ModItemGroups.registeredItemGroup();
	}
}