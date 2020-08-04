package net.crystal.mod;

import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;

@FunctionalInterface
public interface MyStupidInterface {

    DefaultedList<ItemStack> getItems();

}