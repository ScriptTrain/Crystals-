package net.crystal.mod.polisher;

import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import net.minecraft.entity.player.PlayerEntity;

import net.minecraft.text.Text;


public class PolisherBlockScreen extends CottonInventoryScreen<PolisherGuiDescription> {
    public PolisherBlockScreen(PolisherGuiDescription gui, PlayerEntity player, Text title) {
        super(gui, player, title);
    }
}