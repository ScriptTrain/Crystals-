package net.crystal.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.world.gen.GenerationStep;

//feature-branch test comment

public class CrystalMod implements ModInitializer {

    public static final Item AMETHYST = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static final Block AMETHYST_BLOCK = new AmethystBlock();

    public static final Block AMETHYST_ORE = new AmethystOre();

    public static final Block RUBY_BLOCK = new RubyBlock();

    public static final Block RUBY_ORE = new RubyOre();

    public static final ArmorMaterial AMETHYST_ARMOR = new AmethystArmorMaterial();

    public static final ArmorMaterial EMERALD_ARMOR = new EmeraldArmorMaterial();

    public static final ArmorMaterial RUBY_ARMOR = new RubyArmorMaterial();    

    private static final Feature<DefaultFeatureConfig> LAVA_HOLE = Registry.register(
        Registry.FEATURE,
        new Identifier("crystalmod", "stone_spiral"),
        new StoneSpiralFeature(null)
    );

    @Override
    public void onInitialize() {

        Registry.register(Registry.ITEM, new Identifier("crystalmod", "amethyst"), AMETHYST);
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "ruby"), RUBY);

        Registry.register(Registry.BLOCK, new Identifier("crystalmod", "amethyst_block"), AMETHYST_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("crystalmod", "amethyst_ore"), AMETHYST_ORE);
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "amethyst_block"), new BlockItem(AMETHYST_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "amethyst_ore"), new BlockItem(AMETHYST_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier("crystalmod", "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("crystalmod", "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "ruby_block"), new BlockItem(RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "ruby_ore"), new BlockItem(RUBY_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

        Registry.register(Registry.ITEM, new Identifier("crystalmod", "amethyst_pickaxe"), new PickaxeBase(new ToolMaterialAmethyst()));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "amethyst_axe"), new AxeBase(new ToolMaterialAmethyst()));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "amethyst_shovel"), new ShovelBase(new ToolMaterialAmethyst()));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "amethyst_sword"), new SwordBase(new ToolMaterialAmethyst()));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "amethyst_hoe"), new HoeBase(new ToolMaterialAmethyst()));

        Registry.register(Registry.ITEM, new Identifier("crystalmod", "emerald_pickaxe"), new PickaxeBase(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "emerald_axe"), new AxeBase(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "emerald_shovel"), new ShovelBase(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "emerald_sword"), new SwordBase(new ToolMaterialEmerald()));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "emerald_hoe"), new HoeBase(new ToolMaterialEmerald()));

        Registry.register(Registry.ITEM, new Identifier("crystalmod", "ruby_pickaxe"), new PickaxeBase(new ToolMaterialRuby()));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "ruby_axe"), new AxeBase(new ToolMaterialRuby()));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "ruby_shovel"), new ShovelBase(new ToolMaterialRuby()));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "ruby_sword"), new SwordBase(new ToolMaterialRuby()));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "ruby_hoe"), new HoeBase(new ToolMaterialRuby()));

        Registry.register(Registry.ITEM, new Identifier("crystalmod", "amethyst_helmet"), new BaseArmor(AMETHYST_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "amethyst_chestplate"), new BaseArmor(AMETHYST_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "amethyst_leggings"), new BaseArmor(AMETHYST_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "amethyst_boots"), new BaseArmor(AMETHYST_ARMOR, EquipmentSlot.FEET));

        Registry.register(Registry.ITEM, new Identifier("crystalmod", "emerald_helmet"), new BaseArmor(EMERALD_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "emerald_chestplate"), new BaseArmor(EMERALD_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "emerald_leggings"), new BaseArmor(EMERALD_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "emerald_boots"), new BaseArmor(EMERALD_ARMOR, EquipmentSlot.FEET));

        Registry.register(Registry.ITEM, new Identifier("crystalmod", "ruby_helmet"), new BaseArmor(RUBY_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "ruby_chestplate"), new BaseArmor(RUBY_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "ruby_leggings"), new BaseArmor(RUBY_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier("crystalmod", "ruby_boots"), new BaseArmor(RUBY_ARMOR, EquipmentSlot.FEET));

        Registry.BIOME.forEach(this::handleBiome);
        RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> handleBiome(biome));

        Registry.BIOME.forEach(CrystalMod::putFeatures);        
    }

    private static void putFeatures(Biome biome) {
        biome.addFeature(GenerationStep.Feature.RAW_GENERATION,
            LAVA_HOLE.configure(new DefaultFeatureConfig())
                .createDecoratedFeature(Decorator.CHANCE_HEIGHTMAP.configure(new ChanceDecoratorConfig(100))));
    }

    private void handleBiome(final Biome biome) {
        if(biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Feature.ORE.configure(
                new OreFeatureConfig(
                    OreFeatureConfig.Target.NATURAL_STONE,
                    CrystalMod.RUBY_ORE.getDefaultState(),
                    10 //Ore vein size
               )).createDecoratedFeature(
                Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                    2, //Number of veins per chunk
                    0, //Bottom Offset
                    0, //Min y level
                    15 //Max y level
            ))));
        }

        if(biome.getCategory() == Biome.Category.NETHER) {
            biome.addFeature(
                    GenerationStep.Feature.UNDERGROUND_ORES,
                    Feature.ORE.configure(
                new OreFeatureConfig(
                    OreFeatureConfig.Target.NETHER_ORE_REPLACEABLES,
                    CrystalMod.AMETHYST_ORE.getDefaultState(),
                    2 //Ore vein size
               )).createDecoratedFeature(
                Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(
                    1, //Number of veins per chunk
                    0, //Bottom Offset
                    0, //Min y level
                    20 //Max y level
            ))));
        }
    }

}