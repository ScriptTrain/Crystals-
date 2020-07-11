package net.crystal.mod;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialAmethyst implements ToolMaterial {

    @Override
    public float getAttackDamage() {
        return 3f;
    }

    @Override
    public int getDurability() {
        return 1700;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(CrystalMod.AMETHYST);
    }
    
}