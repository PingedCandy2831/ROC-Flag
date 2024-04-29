package com.rocflag.item;

import com.rocflag.ROCFlag;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ROC_FLAG_BANNER_PATTERN = registerItems("roc_flag_banner_pattern", new Item(new FabricItemSettings()));

    private static void addItemsToIG(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(ROC_FLAG_BANNER_PATTERN);
    }

    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM,new Identifier(ROCFlag.MOD_ID, name),item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIG);
    }
}
