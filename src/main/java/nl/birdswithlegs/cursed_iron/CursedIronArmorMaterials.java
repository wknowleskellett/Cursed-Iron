package nl.birdswithlegs.cursed_iron;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.EnumMap;
import java.util.List;

import static nl.birdswithlegs.cursed_iron.CursedIronMod.MODID;

public class CursedIronArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> CURSED_IRON_ARMOR_MATERIAL = registerCursedIronArmorMaterial();
    public static final RegistryEntry.Reference<SoundEvent> CURSED_IRON_ARMOR_EQUIP = Registry.registerReference(Registries.SOUND_EVENT, new Identifier("entity.iron_golem.repair"), SoundEvent.of(new Identifier("entity.iron_golem.repair")));
	private static final RegistryEntry<ArmorMaterial> IRON = ArmorMaterials.IRON;

    public static void init() {};

    private static RegistryEntry<ArmorMaterial> registerCursedIronArmorMaterial() {
        Identifier id = new Identifier(MODID, "cursed_iron");

        EnumMap<ArmorItem.Type, Integer> enumMap = new EnumMap<>(ArmorItem.Type.class);
        enumMap.put(ArmorItem.Type.BOOTS, 2);
        enumMap.put(ArmorItem.Type.LEGGINGS, 5);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 6);
        enumMap.put(ArmorItem.Type.HELMET, 2);
        enumMap.put(ArmorItem.Type.BODY, 5);

        return Registry.registerReference(
                Registries.ARMOR_MATERIAL,
                id,
                new ArmorMaterial(
                        enumMap,
                        9,
                        CURSED_IRON_ARMOR_EQUIP,
                        () -> Ingredient.ofItems(CursedIronMod.CURSED_IRON_INGOT),
                        List.of(new ArmorMaterial.Layer(id)),
                        0.0F,
                        0.25F
                )
        );
    }
}