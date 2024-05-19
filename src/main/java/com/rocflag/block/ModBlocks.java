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

    public static final Block TOP_LEFT_OF_SMALL_THIN_ROC_FLAG = registerBlocks("top_left_of_small_thin_roc_flag",
            new TopLeftOfSmallThinROCFlag(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    public static final Block TOP_MIDDLE_OF_SMALL_THIN_ROC_FLAG = registerBlocks("top_middle_of_small_thin_roc_flag",
            new TopMiddleOfSmallThinROCFlag(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    public static final Block THIN_ROC_RED = registerBlocks("thin_roc_red",
            new ThinROCRed(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    public static final Block TOP_LEFT_OF_THIN_KUOMINTANG_FLAG = registerBlocks("top_left_of_thin_kuomintang_flag",
            new TopLeftOfThinKuomintangFlag(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    public static final Block TOP_MIDDLE_OF_THIN_KUOMINTANG_FLAG = registerBlocks("top_middle_of_thin_kuomintang_flag",
            new TopMiddleOfThinKuomintangFlag(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    public static final Block TOP_RIGHT_OF_THIN_KUOMINTANG_FLAG = registerBlocks("top_right_of_thin_kuomintang_flag",
            new TopRightOfThinKuomintangFlag(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    public static final Block BOTTOM_LEFT_OF_THIN_KUOMINTANG_FLAG = registerBlocks("bottom_left_of_thin_kuomintang_flag",
            new BottomLeftOfThinKuomintangFlag(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    public static final Block BOTTOM_MIDDLE_OF_THIN_KUOMINTANG_FLAG = registerBlocks("bottom_middle_of_thin_kuomintang_flag",
            new BottomMiddleOfThinKuomintangFlag(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    public static final Block BOTTOM_RIGHT_OF_THIN_KUOMINTANG_FLAG = registerBlocks("bottom_right_of_thin_kuomintang_flag",
            new BottomRightOfThinKuomintangFlag(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    public static final Block KUOMINTANG_FLAG_BLOCK = registerBlocks("kuomintang_flag_block",
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