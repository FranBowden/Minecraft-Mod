package net.fran.mcmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fran.mcmod.McMod;
import net.fran.mcmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;

import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup Ruby_Group = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(McMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);

                    }).build());

    public static void registeredItemGroup() {
        McMod.LOGGER.info("Registering ItemGroup for " + McMod.MOD_ID);
    }
}
