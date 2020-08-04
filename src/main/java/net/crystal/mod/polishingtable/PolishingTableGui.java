package net.crystal.mod.polishingtable;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;

public class PolishingTableGui extends LightweightGuiDescription {
    public PolishingTableGui() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(300, 200);
    }
}