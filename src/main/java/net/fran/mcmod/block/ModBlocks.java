package net.fran.mcmod.block;

import net.fran.mcmod.McMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class ModBlocks {

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",

                    new Block(
                            AbstractBlock.Settings.create()
                                    .mapColor(MapColor.IRON_GRAY)
                                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                                    .requiresTool()
                                    .strength(5.0F, 6.0F)
                                    .sounds(BlockSoundGroup.METAL)
                    )
    );
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, Identifier.of(McMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(McMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registeredModBlocks() {
        McMod.LOGGER.info("Registering ModBlocks for " + McMod.MOD_ID);
    }

}
