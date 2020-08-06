package net.crystal.mod.polisher;

import blue.endless.jankson.annotation.Nullable;
import net.crystal.mod.CrystalMod;
import net.crystal.mod.ImplementedInventory;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;

/* This allows our polishing block to have an invetory. */
public class PolisherBlockEntity extends BlockEntity implements ImplementedInventory, NamedScreenHandlerFactory {
	
	DefaultedList<ItemStack> items =  DefaultedList.ofSize(8, ItemStack.EMPTY);
	
	public PolisherBlockEntity() {
		super(CrystalMod.POLISHER_BLOCK_ENTITY);
	}

	@Override
	public DefaultedList<ItemStack> getItems() {
		return items;
	}
	
	@Override
	public boolean canPlayerUse(PlayerEntity player) {
		return pos.isWithinDistance(player.getBlockPos(), 4.5);
	}

	@Override
	public Text getDisplayName() {
		return new LiteralText(""); // no title
	}

	@Nullable
	@Override
	public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
		return new PolisherGuiDescription(CrystalMod.SCREEN_HANDLER_TYPE, syncId, inv, ScreenHandlerContext.create(world, pos));
    }
}