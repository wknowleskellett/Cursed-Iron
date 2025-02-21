package nl.birdswithlegs.cursed_iron;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class CursedIronArmorMaterial implements ArmorMaterial{
	private static final ArmorMaterial IRON = ArmorMaterials.IRON;

    @Override
    public int getDurability(ArmorItem.Type type) {
        return IRON.getDurability(type);
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return IRON.getProtection(type);
    }

    @Override
    public int getEnchantability() {
        return IRON.getEnchantability();
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ENTITY_IRON_GOLEM_REPAIR;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(CursedIronMod.CURSED_IRON_INGOT);
    }

    @Override
    public String getName() {
        return "cursed_iron";
    }

    @Override
    public float getToughness() {
        return IRON.getToughness();
    }

    @Override
    public float getKnockbackResistance() {
        return 0.25f;
    }

}