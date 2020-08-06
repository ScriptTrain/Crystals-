package net.crystal.mod;

import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import net.crystal.mod.polisher.PolisherGuiDescription;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screen.ScreenProviderRegistry;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.util.Identifier;

public class CrystalModClient implements ClientModInitializer {
    @Override
	public void onInitializeClient() {

        /*ScreenRegistry.<PolisherGuiDescription, CottonInventoryScreen<PolisherGuiDescription>>register(
				CrystalMod.SCREEN_HANDLER_TYPE,
				(desc, inventory, title) -> new CottonInventoryScreen<>(desc, inventory.player, title));*/

				ScreenProviderRegistry.INSTANCE.registerFactory(new Identifier("crystalmod", "gui"), (syncId, identifier, player, buf)->new CottonInventoryScreen<PolisherGuiDescription>(new PolisherGuiDescription(
						null, syncId, player.inventory,
						ScreenHandlerContext.create(player.getEntityWorld(), buf.readBlockPos())), player));
	}
}