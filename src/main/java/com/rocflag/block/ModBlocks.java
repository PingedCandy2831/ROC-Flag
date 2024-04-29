package com.rocflag.block;

import com.rocflag.ROCFlag;
import com.rocflag.block.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block TOP_LEFT_BLOCK = registerBlocks("top_left_block",
            new TopLeftBlock(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    public static final Block TOP_MIDDLE_BLOCK = registerBlocks("top_middle_block",
            new TopMiddleBlock(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    public static final Block TOP_RIGHT_BLOCK = registerBlocks("top_right_block",
            new TopRightBlock(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    public static final Block BOTTOM_LEFT_BLOCK = registerBlocks("bottom_left_block",
            new BottomLeftBlock(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    public static final Block BOTTOM_MIDDLE_BLOCK = registerBlocks("bottom_middle_block",
            new BottomMiddleBlock(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    public static final Block BOTTOM_RIGHT_BLOCK = registerBlocks("bottom_right_block",
            new BottomRightBlock(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    public static final Block ROC_RED_BLOCK = registerBlocks("roc_red_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    public static final Block ROC_BLUE_BLOCK = registerBlocks("roc_blue_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    public static final Block ROC_FLAG_BLOCK = registerBlocks("roc_flag_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    private static Block registerBlocks(String name, Block block) {
        registerBlockItems(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(ROCFlag.MOD_ID,name),block);
    }

    private static Item registerBlockItems(String name, Block block) {
        return Registry.register(Registries.ITEM,new Identifier(ROCFlag.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings()));
    }

    public static void registerModBlocks() {
    }
}