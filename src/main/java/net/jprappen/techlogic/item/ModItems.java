package net.jprappen.techlogic.item;

import net.jprappen.techlogic.TechLogic;
import net.jprappen.techlogic.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    private static final DeferredRegister<Item> ITEMS_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, TechLogic.MODID);

    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS_REGISTER.register("aluminium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_NUGGET = ITEMS_REGISTER.register("aluminium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BAUXITE = ITEMS_REGISTER.register("bauxite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS_REGISTER.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS_REGISTER.register("steel_nugget", () -> new Item(new Item.Properties()));

    public static final RegistryObject<BlockItem> ALUMINIUM_BLOCK = ITEMS_REGISTER.register("aluminium_block", () -> new BlockItem(ModBlocks.ALUMINIUM_BLOCK.get(), new BlockItem.Properties()));
    public static final RegistryObject<BlockItem> BAUXITE_BLOCK = ITEMS_REGISTER.register("bauxite_block", () -> new BlockItem(ModBlocks.BAUXITE_BLOCK.get(), new BlockItem.Properties()));
    public static final RegistryObject<BlockItem> BAUXITE_ORE = ITEMS_REGISTER.register("bauxite_ore", () -> new BlockItem(ModBlocks.BAUXITE_ORE.get(), new BlockItem.Properties()));
    public static final RegistryObject<BlockItem> DEEPSLATE_BAUXITE_ORE = ITEMS_REGISTER.register("deepslate_bauxite_ore", () -> new BlockItem(ModBlocks.DEPSLATE_BAUXITE_ORE.get(), new BlockItem.Properties()));
    public static final RegistryObject<BlockItem> STEEL_BLOCK = ITEMS_REGISTER.register("steel_block", () -> new BlockItem(ModBlocks.STEEL_BLOCK.get(), new BlockItem.Properties()));

    public static void init(IEventBus eventBus) {
        ITEMS_REGISTER.register(eventBus);
    }
}
