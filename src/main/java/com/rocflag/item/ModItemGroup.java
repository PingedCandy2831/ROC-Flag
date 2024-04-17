package com.rocflag.item;

import com.rocflag.ROCFlag;
import com.rocflag.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup ROC_FLAG_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ROCFlag.MOD_ID, "roc_flag_group"),
            FabricItemGroup
                    .builder()
                    .displayName(Text.translatable("itemGroup.roc_flag_group"))
                    .icon(()-> new ItemStack(ModBlocks.ROC_FLAG_BLOCK))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ROC_RED_BLOCK);
                        entries.add(ModBlocks.TOP_LEFT_BLOCK);
                        entries.add(ModBlocks.TOP_MIDDLE_BLOCK);
                        entries.add(ModBlocks.TOP_RIGHT_BLOCK);
                        entries.add(ModBlocks.BOTTOM_LEFT_BLOCK);
                        entries.add(ModBlocks.BOTTOM_MIDDLE_BLOCK);
                        entries.add(ModBlocks.BOTTOM_RIGHT_BLOCK);
                        entries.add(ModBlocks.ROC_BLUE_BLOCK);
                        entries.add(ModBlocks.ROC_FLAG_BLOCK);
                    }).build());
    public static void registerModItemGroup() {

    }
}


