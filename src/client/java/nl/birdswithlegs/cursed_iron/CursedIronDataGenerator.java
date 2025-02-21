package nl.birdswithlegs.cursed_iron;

import java.util.List;
import java.util.function.Consumer;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class CursedIronDataGenerator implements DataGeneratorEntrypoint {
 
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();
 
        pack.addProvider(CursedIronRecipeGenerator::new);
    }

    private static class CursedIronRecipeGenerator extends FabricRecipeProvider {
        private CursedIronRecipeGenerator(FabricDataOutput generator) {
            super(generator);
        }

        @Override
        public void generate(Consumer<RecipeJsonProvider> exporter) {
            Item ingot = CursedIronMod.CURSED_IRON_INGOT;
            Item stick = Items.STICK;

            //AXE
            ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, CursedIronMod.CURSED_IRON_AXE).pattern(" ii").pattern(" si").pattern(" s ")
            .input('i', ingot)
            .input('s', stick)
            .criterion(FabricRecipeProvider.hasItem(ingot),
                    FabricRecipeProvider.conditionsFromItem(ingot))
            .criterion(FabricRecipeProvider.hasItem(stick),
                    FabricRecipeProvider.conditionsFromItem(stick))
            .offerTo(exporter);

            // ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, CursedIronMod.CURSED_IRON_AXE).pattern("ii ").pattern("is ").pattern(" s ")
            // .input('i', ingot)
            // .input('s', stick)
            // .criterion(FabricRecipeProvider.hasItem(ingot),
            //         FabricRecipeProvider.conditionsFromItem(ingot))
            // .criterion(FabricRecipeProvider.hasItem(stick),
            //         FabricRecipeProvider.conditionsFromItem(stick))
            // .offerTo(exporter);

            //BLOCK from INGOT
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, CursedIronMod.CURSED_IRON_BLOCK_ITEM).pattern("iii").pattern("iii").pattern("iii")
            .input('i', ingot)
            .criterion(FabricRecipeProvider.hasItem(ingot),
                    FabricRecipeProvider.conditionsFromItem(ingot))
            .offerTo(exporter);

            //INGOT from NUGGET
            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ingot).pattern("nnn").pattern("nnn").pattern("nnn")
                    .input('n', CursedIronMod.CURSED_IRON_NUGGET)
                    .criterion(FabricRecipeProvider.hasItem(CursedIronMod.CURSED_IRON_NUGGET),
                            FabricRecipeProvider.conditionsFromItem(CursedIronMod.CURSED_IRON_NUGGET))
                    .offerTo(exporter, new Identifier(CursedIronMod.MODID, "cursed_iron_ingot1"));

            //NUGGET from INGOT
            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, CursedIronMod.CURSED_IRON_NUGGET, 9)
                    .input(ingot)
                    .criterion(FabricRecipeProvider.hasItem(ingot),
                            FabricRecipeProvider.conditionsFromItem(ingot))
                    .offerTo(exporter);

            //INGOT from BLOCK
            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ingot, 9)
                    .input(CursedIronMod.CURSED_IRON_BLOCK_ITEM)
                    .criterion(FabricRecipeProvider.hasItem(CursedIronMod.CURSED_IRON_BLOCK_ITEM),
                            FabricRecipeProvider.conditionsFromItem(CursedIronMod.CURSED_IRON_BLOCK_ITEM))
                    .offerTo(exporter, new Identifier(CursedIronMod.MODID, "cursed_iron_ingot2"));

            //BOOTS
            ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, CursedIronMod.CURSED_IRON_BOOTS).pattern("i i").pattern("i i")
            .input('i', ingot)
            .criterion(FabricRecipeProvider.hasItem(ingot),
                    FabricRecipeProvider.conditionsFromItem(ingot))
            .offerTo(exporter);

            //CHESTPLATE
            ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, CursedIronMod.CURSED_IRON_CHESTPLATE).pattern("i i").pattern("iii").pattern("iii")
            .input('i', ingot)
            .criterion(FabricRecipeProvider.hasItem(ingot),
                    FabricRecipeProvider.conditionsFromItem(ingot))
            .offerTo(exporter);

            //HELMET
            ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, CursedIronMod.CURSED_IRON_HELMET).pattern("iii").pattern("i i")
            .input('i', ingot)
            .criterion(FabricRecipeProvider.hasItem(ingot),
                    FabricRecipeProvider.conditionsFromItem(ingot))
            .offerTo(exporter);

            //HOE
            ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, CursedIronMod.CURSED_IRON_HOE).pattern(" ii").pattern(" s ").pattern(" s ")
            .input('i', ingot)
            .input('s', stick)
            .criterion(FabricRecipeProvider.hasItem(ingot),
                    FabricRecipeProvider.conditionsFromItem(ingot))
            .criterion(FabricRecipeProvider.hasItem(stick),
                    FabricRecipeProvider.conditionsFromItem(stick))
            .offerTo(exporter);

            // ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, CursedIronMod.CURSED_IRON_HOE).pattern("ii ").pattern(" s ").pattern(" s ")
            // .input('i', ingot)
            // .input('s', stick)
            // .criterion(FabricRecipeProvider.hasItem(ingot),
            //         FabricRecipeProvider.conditionsFromItem(ingot))
            // .criterion(FabricRecipeProvider.hasItem(stick),
            //         FabricRecipeProvider.conditionsFromItem(stick))
            // .offerTo(exporter);

            //LEGGINGS
            ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, CursedIronMod.CURSED_IRON_LEGGINGS).pattern("iii").pattern("i i").pattern("i i")
            .input('i', ingot)
            .criterion(FabricRecipeProvider.hasItem(ingot),
                    FabricRecipeProvider.conditionsFromItem(ingot))
            .offerTo(exporter);

            //PICKAXE
            ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, CursedIronMod.CURSED_IRON_PICKAXE).pattern("iii").pattern(" s ").pattern(" s ")
            .input('i', ingot)
            .input('s', stick)
            .criterion(FabricRecipeProvider.hasItem(ingot),
                    FabricRecipeProvider.conditionsFromItem(ingot))
            .criterion(FabricRecipeProvider.hasItem(stick),
                    FabricRecipeProvider.conditionsFromItem(stick))
            .offerTo(exporter);

            //SHOVEL
            ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, CursedIronMod.CURSED_IRON_SHOVEL).pattern(" i ").pattern(" s ").pattern(" s ")
            .input('i', ingot)
            .input('s', stick)
            .criterion(FabricRecipeProvider.hasItem(ingot),
                    FabricRecipeProvider.conditionsFromItem(ingot))
            .criterion(FabricRecipeProvider.hasItem(stick),
                    FabricRecipeProvider.conditionsFromItem(stick))
            .offerTo(exporter);

            //SWORD
            ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, CursedIronMod.CURSED_IRON_SWORD).pattern(" i ").pattern(" i ").pattern(" s ")
            .input('i', ingot)
            .input('s', stick)
            .criterion(FabricRecipeProvider.hasItem(ingot),
                    FabricRecipeProvider.conditionsFromItem(ingot))
            .criterion(FabricRecipeProvider.hasItem(stick),
                    FabricRecipeProvider.conditionsFromItem(stick))
            .offerTo(exporter);

            //SMELT INGOT INTO REGULAR IRON
            RecipeProvider.offerSmelting(exporter, List.of(ingot), RecipeCategory.MISC, Items.IRON_INGOT, 3, 300, getName());
        }
    }

}
