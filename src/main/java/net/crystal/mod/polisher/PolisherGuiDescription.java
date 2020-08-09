package net.crystal.mod.polisher;

import io.github.cottonmc.cotton.gui.SyncedGuiDescription;
import io.github.cottonmc.cotton.gui.widget.*;
import io.github.cottonmc.cotton.gui.widget.data.HorizontalAlignment;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.text.TranslatableText;

public class PolisherGuiDescription extends SyncedGuiDescription {

	public PolisherGuiDescription(ScreenHandlerType<?> type, int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
		super(type, syncId, playerInventory, getBlockInventory(context), null);
		
		WGridPanel root = (WGridPanel)this.getRootPanel();

		root.setSize(160, 170);

		WLabel label = new WLabel(new TranslatableText("Polishing Table"));
		root.add(label, 0, 0, 4, 1);
		label.setHorizontalAlignment(HorizontalAlignment.CENTER);
		
		root.add(WItemSlot.of(blockInventory, 0, 1, 1), 2, 1);
		root.add(WItemSlot.of(blockInventory, 0, 1, 1), 3, 1);
		root.add(WItemSlot.of(blockInventory, 0, 1, 1), 4, 1);
		root.add(WItemSlot.of(blockInventory, 0, 1, 1), 2, 2);
		root.add(WItemSlot.of(blockInventory, 0, 1, 1), 3, 2);
		root.add(WItemSlot.of(blockInventory, 0, 1, 1), 4, 2);
		root.add(WItemSlot.of(blockInventory, 0, 1, 1), 2, 3);
		root.add(WItemSlot.of(blockInventory, 0, 1, 1), 3, 3);
		root.add(WItemSlot.of(blockInventory, 0, 1, 1), 4, 3);
		root.add(WItemSlot.of(blockInventory, 0, 1, 1), 6, 2);


		root.add(createPlayerInventoryPanel(), 0, 5);
		System.out.println(root.toString());

		this.getRootPanel().validate(this);
	}
}