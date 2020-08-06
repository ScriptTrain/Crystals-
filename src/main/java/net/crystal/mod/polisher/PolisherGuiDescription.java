package net.crystal.mod.polisher;

import io.github.cottonmc.cotton.gui.SyncedGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WItemSlot;
import io.github.cottonmc.cotton.gui.widget.WTextField;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.text.LiteralText;

public class PolisherGuiDescription extends SyncedGuiDescription {

	public PolisherGuiDescription(ScreenHandlerType<?> type, int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
		super(type, syncId, playerInventory, getBlockInventory(context), null);
		
		WGridPanel root = (WGridPanel)this.getRootPanel();
		
		root.add(WItemSlot.of(blockInventory, 0, 4, 1), 0, 1);

		root.add(new WButton(new LiteralText("Button A")), 0, 3, 4, 1);
		root.add(new WButton(new LiteralText("Button B")), 5, 3, 4, 1);
		root.add(new WButton(new LiteralText("Button C")), 0, 5, 4, 1);
		root.add(new WButton(new LiteralText("Button D")), 5, 5, 4, 1);
		root.add(new WTextField(new LiteralText("Type something...")), 0, 7, 5, 1);

		root.add(createPlayerInventoryPanel(), 0, 9);
		System.out.println(root.toString());

		this.getRootPanel().validate(this);
	}
}