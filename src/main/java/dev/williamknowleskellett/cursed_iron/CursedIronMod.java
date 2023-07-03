package dev.williamknowleskellett.cursed_iron;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CursedIronMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("cursed_iron");
    public static final String MODID = "cursed_iron";

    public static final Item CURSED_IRON_INGOT = Registry.register(Registries.ITEM, new Identifier(MODID, "cursed_iron_ingot"), new Item(new Item.Settings()));
    public static final Item CURSED_IRON_NUGGET = Registry.register(Registries.ITEM, new Identifier(MODID, "cursed_iron_nugget"), new Item(new Item.Settings()));

    public static final Block CURSED_IRON_BLOCK = Registry.register(Registries.BLOCK, new Identifier(MODID, "cursed_iron_block"), new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.IRON_GRAY).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL)));    
    public static final Item CURSED_IRON_BLOCK_ITEM = Registry.register(Registries.ITEM, new Identifier(MODID, "cursed_iron_block_item"), new BlockItem(CURSED_IRON_BLOCK, new Item.Settings()));

    public static final Item CURSED_IRON_SWORD = Registry.register(Registries.ITEM, new Identifier(MODID, "cursed_iron_sword"), new SwordItem(ToolMaterials.IRON, 3, -2.4f, new Item.Settings()));
    public static final Item CURSED_IRON_SHOVEL = Registry.register(Registries.ITEM, new Identifier(MODID, "cursed_iron_shovel"), new ShovelItem(ToolMaterials.IRON, 1.5f, -3.0f, new Item.Settings()));
    public static final Item CURSED_IRON_PICKAXE = Registry.register(Registries.ITEM, new Identifier(MODID, "cursed_iron_pickaxe"), new PickaxeItem(ToolMaterials.IRON, 1, -2.8f, new Item.Settings()));
    public static final Item CURSED_IRON_AXE = Registry.register(Registries.ITEM, new Identifier(MODID, "cursed_iron_axe"), new AxeItem(ToolMaterials.IRON, 6.0f, -3.1f, new Item.Settings()));
    public static final Item CURSED_IRON_HOE = Registry.register(Registries.ITEM, new Identifier(MODID, "cursed_iron_hoe"), new HoeItem(ToolMaterials.IRON, -2, -1.0f, new Item.Settings()));
    
    public static final Item CURSED_IRON_HELMET = Registry.register(Registries.ITEM, new Identifier(MODID, "cursed_iron_helmet"), new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item CURSED_IRON_CHESTPLATE = Registry.register(Registries.ITEM, new Identifier(MODID, "cursed_iron_chestplate"), new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item CURSED_IRON_LEGGINGS = Registry.register(Registries.ITEM, new Identifier(MODID, "cursed_iron_leggings"), new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item CURSED_IRON_BOOTS = Registry.register(Registries.ITEM, new Identifier(MODID, "cursed_iron_boots"), new ArmorItem(ArmorMaterials.IRON, ArmorItem.Type.BOOTS, new Item.Settings()));

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Hello Fabric world!");
    }
}