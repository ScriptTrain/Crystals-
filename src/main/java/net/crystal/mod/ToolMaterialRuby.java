package net.crystal.mod;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialRuby implements ToolMaterial {

    @Override
    public float getAttackDamage() {
        return 2.5f;
    }

    @Override
    public int getDurability() {
        return 1561;
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(CrystalMod.RUBY);
    }
    
}