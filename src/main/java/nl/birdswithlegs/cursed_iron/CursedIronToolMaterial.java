package nl.birdswithlegs.cursed_iron;

import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;

public class CursedIronToolMaterial implements ToolMaterial {
    ToolMaterial IRON = ToolMaterials.IRON;

    @Override
    public int getDurability() {
        return IRON.getDurability();
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return IRON.getMiningSpeedMultiplier();
    }

    @Override
    public float getAttackDamage() {
        return IRON.getAttackDamage();
    }

    @Override
    public int getMiningLevel() {
        return IRON.getMiningLevel();
    }

    @Override
    public int getEnchantability() {
        return IRON.getEnchantability();
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(CursedIronMod.CURSED_IRON_INGOT);
    }
}
