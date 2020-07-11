package net.crystal.mod;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class AxeBase extends AxeItem {

    protected AxeBase(ToolMaterial material) {
        super(material, 4.5f, -3f,  new Item.Settings().group(ItemGroup.TOOLS));
    }
    
}