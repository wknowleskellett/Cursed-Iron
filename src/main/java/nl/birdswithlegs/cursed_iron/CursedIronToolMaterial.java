package nl.birdswithlegs.cursed_iron;

import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

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
    public TagKey<Block> getInverseTag() { return IRON.getInverseTag(); }

    @Override
    public int getEnchantability() {
        return IRON.getEnchantability();
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(CursedIronMod.CURSED_IRON_INGOT);
    }
}
