package gjakaina.ultimatemailmod.item;

import gjakaina.ultimatemailmod.UltimateMailMod;
import gjakaina.ultimatemailmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ULTIMATE_MAIL_MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(UltimateMailMod.MOD_ID, "ultimate_mail_mod"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.LETTER))
                    .displayName(Text.translatable("itemgroup.ultimatemailmod.ultimate_mail_mod"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.LETTER);
                        entries.add(ModBlocks.MAIL_STORAGE_BLOCK);
                    })
                    .build());

    public static void registerItemGroups() {
        UltimateMailMod.LOGGER.info("Registering Item Groups for " + UltimateMailMod.MOD_ID);
    }
}
