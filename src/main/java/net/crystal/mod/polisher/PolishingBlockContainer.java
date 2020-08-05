package net.crystal.mod.polisher;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;

public class PolishingBlockContainer extends CraftingScreenHandler {

    public PolishingBlockContainer(int syncId, PlayerInventory playerInventory, ScreenHandlerContext blockContext) {
        super(syncId, playerInventory, blockContext);
    }

    @Override
    public boolean canUse(PlayerEntity playerInventory) {
        return true;
    }

    
}