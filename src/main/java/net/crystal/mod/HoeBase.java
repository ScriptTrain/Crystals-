package net.crystal.mod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class HoeBase extends HoeItem {

    public HoeBase(final ToolMaterial material) {
        super(material, -3, -0.5f, new Item.Settings().group(ItemGroup.TOOLS));
    }
    
}