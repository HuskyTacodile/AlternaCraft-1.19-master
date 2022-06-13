package com.huskytacodile.alternacraft.item;

import com.huskytacodile.alternacraft.Alternacraft;
import com.huskytacodile.alternacraft.entities.ModEntityTypes;
import com.huskytacodile.alternacraft.item.custom.*;

import com.huskytacodile.alternacraft.util.Dino;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraftforge.registries.*;

import java.util.Arrays;
import java.util.Objects;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Alternacraft.MOD_ID);

    public static final RegistryObject<Item> ALTERNA_STAFF = ITEMS.register("alterna_staff", CatalystItem::new);
    public static final RegistryObject<ForgeSpawnEggItem> JPFEMALESPINO_SPAWN_EGG = ITEMS.register("jpspino_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.JPSPINO, 0x614141, 0xDC0000,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> SIMPLIFIED_SPINO_SPAWN_EGG = ITEMS.register("simplified_spino_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SIMPLIFIED_SPINO, 0x614141, 0xDC0000,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> MALUSAURUS_SPAWN_EGG = ITEMS.register("malusaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.MALUSAURUS, 0x614141, 0xDC0000,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> INDOMINUS_SPAWN_EGG = ITEMS.register("indominus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.INDOMINUS, 0xC8C8C8, 0xA5A5A5,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> OXALIA_SPAWN_EGG = ITEMS.register("oxalaia_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.OXALAIA, 0xDFCC8F, 0x2D2611,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> SPINO_GEN2_SPAWN_EGG = ITEMS.register("spino_gen2_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SPINO, 0xD3D751, 0xB12626,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> BLUE_SPAWN_EGG = ITEMS.register("blue_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.BLUE, 0xA9A9A9,0x008DAF ,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> BETA_SPAWN_EGG = ITEMS.register("beta_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.BETA, 0xA9A9A9, 0x008DAF,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> TYLOSAURUS_SPAWN_EGG = ITEMS.register("tylosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.TYLOSAURUS, 0xF4F4F4, 0x131929,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> MOSASAURUS_SPAWN_EGG = ITEMS.register("mosasaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.MOSASAURUS, 0x5998C6, 0x19424A,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> CERATOSUCHOPS_SPAWN_EGG = ITEMS.register("ceratosuchops_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CERATOSUCHOPS, 0x585551, 0xA18B00,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> ALTERNASAURUS_SPAWN_EGG = ITEMS.register("alternasaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ALTERNASAURUS, 0x000000, 0x1CFCFF,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> INDORAPTOR_SPAWN_EGG = ITEMS.register("indoraptor_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.INDORAPTOR, 0x222222, 0xF0C500,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> ACRO_SPAWN_EGG = ITEMS.register("acro_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ACRO, 0xE39F30, 0x30BDE3,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> TYRANNOSAURUS_SPAWN_EGG = ITEMS.register("tyrannosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.TYRANNOSAURUS, 0xB09739, 0x6A5713,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> SCORPIUS_SPAWN_EGG = ITEMS.register("scorpius_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SCORPIUS, 0x4F4F4F, 0x0A0A0A,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> ALLOSAURUS_SPAWN_EGG = ITEMS.register("allosaurus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ALLOSAURUS, 0xB33B3B, 0x2D71D3,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> BARYONYX_SPAWN_EGG = ITEMS.register("baryonyx_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.BARYONYX, 0x878787, 0x003176,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> BARYONYX_GEN2_SPAWN_EGG = ITEMS.register("baryonyx_gen2_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.BARYONYX_GEN2, 0x878787, 0xF9FF1E,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> ALIORAMUS_SPAWN_EGG = ITEMS.register("alioramus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ALIORAMUS, 0x8BCB42, 0x53801F,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> CARCHA_SPAWN_EGG = ITEMS.register("carcha_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.CARCHA, 0x2D2D2D, 0xC00000,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> COMPY_SPAWN_EGG = ITEMS.register("compy_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.COMPY, 0x9FDC55, 0x7D8F66,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> MEGALO_SPAWN_EGG = ITEMS.register("megalo_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.MEGALO, 0x4D3D2D, 0xC27007,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> YUTYRANNUS_SPAWN_EGG = ITEMS.register("yutyrannus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.YUTYRANNUS, 0xDFDFDF, 0xA68B48,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<ForgeSpawnEggItem> GIGA_SPAWN_EGG = ITEMS.register("giga_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.GIGA, 0x878787, 0x313131,
                    new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> FOSSIL = ITEMS.register("fossil",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> TOTEM_OF_HUGO = ITEMS.register("totem_of_hugo",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> TOTEM_OF_ELEMENT = ITEMS.register("totem_of_element",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PAINITE = ITEMS.register("painite",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PRIMORDIAL_SHARD = ITEMS.register("primordial_shard",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PRIME_BIOLUMINESCENCE = ITEMS.register("prime_bioluminescence",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> BIOLUMINESCENCE = ITEMS.register("bioluminescence",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> MALACHITE = ITEMS.register("malachite",
            ()-> new MalachiteItem(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> MOSQUITO_IN_AMBER = ITEMS.register("mosquito_in_amber",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> AMONG_US_RED = ITEMS.register("among_us_red",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PAINITE_SWORD = ITEMS.register("painite_sword",
            ()-> new SwordItem(ModItemTier.PAINITE, 2,1f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> CARAMEL_SWORD = ITEMS.register("caramel_sword",
            ()-> new CaramelSwordItem(ModItemTier.ICE_CREAM, 3,1f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> MINT_SWORD = ITEMS.register("mint_sword",
            ()-> new MintSwordItem(ModItemTier.ICE_CREAM, 3,1f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> SHERBET_SWORD = ITEMS.register("sherbet_sword",
            ()-> new SherbetSwordItem(ModItemTier.ICE_CREAM, 3,1f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> TRI_BLADE = ITEMS.register("tri_blade",
            ()-> new SwordItem(ModItemTier.PAINITE, 7,3f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PRIMORDIAL_BLADE = ITEMS.register("primordial_blade",
            ()-> new SwordItem(ModItemTier.PRIMORDIAL, 3,3f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PAINITE_PICKAXE = ITEMS.register("painite_pickaxe",
            ()-> new PickaxeItem(ModItemTier.PAINITE, 1,-2f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PAINITE_AXE = ITEMS.register("painite_axe",
            ()-> new AxeItem(ModItemTier.PAINITE, 4,-1f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PAINITE_SHOVEL = ITEMS.register("painite_shovel",
            ()-> new ShovelItem(ModItemTier.PAINITE, 0,-1f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<Item> PAINITE_HOE = ITEMS.register("painite_hoe",
            ()-> new HoeItem(ModItemTier.PAINITE, 0,0f,new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP)));

    public static final RegistryObject<PainiteBowItem> PAINITE_BOW = ITEMS.register("painite_bow",
            () -> new PainiteBowItem(new Item.Properties().tab(ModCreativeModeTab.ALTERNACRAFT_GROUP).stacksTo(1)));

    public static final RegistryObject<Item> EMPTY_SYRINGE = ITEMS.register("dna_syringe",
            () -> new DNASyringeItem(new Item.Properties().tab(ModCreativeModeTab.DNA_SYRINGES)));

    /* DNA SYRINGES */
    public static void onRegisterItems(RegisterEvent.RegisterHelper<Item> helper) {
        var resources = Dino.values();

        Arrays.stream(resources).filter(d -> d != Dino.EMPTY).forEach(dino -> {
            Item syringeItem = new DNASyringeItem(new Item.Properties().tab(ModCreativeModeTab.DNA_SYRINGES));
            dino.setSyringeItem(syringeItem);

            helper.register(new ResourceLocation(Alternacraft.MOD_ID,"dna_syringe_" + dino.getName()), syringeItem);
        });
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
