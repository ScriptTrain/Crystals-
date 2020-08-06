package net.crystal.mod.polisher.client;

import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import net.crystal.mod.CrystalMod;
import net.crystal.mod.polisher.PolisherBlockScreen;
import net.crystal.mod.polisher.PolisherGuiDescription;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
//import net.fabricmc.fabric.api.client.screen.ScreenProviderRegistry;

public class LibGuiTestClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		ScreenRegistry.<PolisherGuiDescription, CottonInventoryScreen<PolisherGuiDescription>>register(
				CrystalMod.SCREEN_HANDLER_TYPE,
                (desc, inventory, title) ->  new CottonInventoryScreen<>(desc, inventory.player, title));
    }

}
