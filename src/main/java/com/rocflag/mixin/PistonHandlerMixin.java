package com.rocflag.mixin;

import com.rocflag.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.piston.PistonHandler;
import net.minecraft.registry.Registries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PistonHandler.class)
public class PistonHandlerMixin {

    @Inject(at = @At("HEAD"), method = "isBlockSticky", cancellable = true)
    private static void slimeology$isBlockStickyMixin(BlockState state, CallbackInfoReturnable<Boolean> cir) {
        boolean isStateHoney = state.getBlock() == Blocks.HONEY_BLOCK;
        boolean isAdjacentStateHoney = state.getBlock() == Blocks.HONEY_BLOCK;

        if (state.getBlock() == ModBlocks.BOTTOM_LEFT_BLOCK) {
            cir.setReturnValue(true);
        }
        if (state.getBlock() == ModBlocks.BOTTOM_MIDDLE_BLOCK) {
            cir.setReturnValue(true);
        }
        if (state.getBlock() == ModBlocks.BOTTOM_RIGHT_BLOCK) {
            cir.setReturnValue(true);
        }
        if (state.getBlock() == ModBlocks.TOP_LEFT_BLOCK) {
            cir.setReturnValue(true);
        }
        if (state.getBlock() == ModBlocks.TOP_MIDDLE_BLOCK) {
            cir.setReturnValue(true);
        }
        if (state.getBlock() == ModBlocks.TOP_RIGHT_BLOCK) {
            cir.setReturnValue(true);
        }
        if (state.getBlock() == ModBlocks.ROC_RED_BLOCK) {
            cir.setReturnValue(true);
        }
        if (state.getBlock() == ModBlocks.ROC_BLUE_BLOCK) {
            cir.setReturnValue(true);
        }
        if (state.getBlock() == ModBlocks.ROC_FLAG_BLOCK) {
            cir.setReturnValue(true);
        }
    }

    @Inject(at = @At("HEAD"), method = "isAdjacentBlockStuck", cancellable = true)
    private static void slimeology$isAdjacentBlockStuckMixin(BlockState state, BlockState adjacentState, CallbackInfoReturnable<Boolean> cir) {
        if (state.getBlock() == ModBlocks.BOTTOM_LEFT_BLOCK && adjacentState.getBlock() == ModBlocks.BOTTOM_LEFT_BLOCK) {
            cir.setReturnValue(true);
        }
        if (state.getBlock() == ModBlocks.BOTTOM_MIDDLE_BLOCK && adjacentState.getBlock() == ModBlocks.BOTTOM_MIDDLE_BLOCK) {
            cir.setReturnValue(true);
        }
        if (state.getBlock() == ModBlocks.BOTTOM_RIGHT_BLOCK && adjacentState.getBlock() == ModBlocks.BOTTOM_RIGHT_BLOCK) {
            cir.setReturnValue(true);
        }
        if (state.getBlock() == ModBlocks.TOP_LEFT_BLOCK && adjacentState.getBlock() == ModBlocks.TOP_LEFT_BLOCK) {
            cir.setReturnValue(true);
        }
        if (state.getBlock() == ModBlocks.TOP_MIDDLE_BLOCK && adjacentState.getBlock() == ModBlocks.TOP_MIDDLE_BLOCK) {
            cir.setReturnValue(true);
        }
        if (state.getBlock() == ModBlocks.TOP_RIGHT_BLOCK && adjacentState.getBlock() == ModBlocks.TOP_RIGHT_BLOCK) {
            cir.setReturnValue(true);
        }
        if (state.getBlock() == ModBlocks.ROC_RED_BLOCK && adjacentState.getBlock() == ModBlocks.ROC_RED_BLOCK) {
            cir.setReturnValue(true);
        }
        if (state.getBlock() == ModBlocks.ROC_BLUE_BLOCK && adjacentState.getBlock() == ModBlocks.ROC_BLUE_BLOCK) {
            cir.setReturnValue(true);
        }
        if (state.getBlock() == ModBlocks.ROC_FLAG_BLOCK && adjacentState.getBlock() == ModBlocks.ROC_FLAG_BLOCK){
            cir.setReturnValue(true);
        }
    }
}