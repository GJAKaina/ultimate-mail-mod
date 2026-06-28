package gjakaina.ultimatemailmod.block;

import gjakaina.ultimatemailmod.UltimateMailMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block MAIL_STORAGE_BLOCK = registerBlock(
            new Block(AbstractBlock.Settings.create().strength(2.5F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static Block registerBlock(Block block) {
        registerBlockItem("mail_storage_block", block);
        return Registry.register(Registries.BLOCK, Identifier.of(UltimateMailMod.MOD_ID, "mail_storage_block"), block);
    }

    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(UltimateMailMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        UltimateMailMod.LOGGER.info("Registering Mod Blocks for " + UltimateMailMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> entries.add(ModBlocks.MAIL_STORAGE_BLOCK));
    }

}
