package gjakaina.ultimatemailmod.item;

import gjakaina.ultimatemailmod.UltimateMailMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item LETTER = registerItem("letter", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(UltimateMailMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        UltimateMailMod.LOGGER.info("Registering Mod Items for " + UltimateMailMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(LETTER);
        });
    }
}
