package net.crystal.mod.polishingtable;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;

public class PolishingTableContainer extends CraftingScreenHandler {

    public PolishingTableContainer(int syncId, PlayerInventory playerInventory, ScreenHandlerContext blockContext) {
        super(syncId, playerInventory, blockContext);
    }

    @Override
    public boolean canUse(PlayerEntity playerInventory) {
        return true;
    }
}