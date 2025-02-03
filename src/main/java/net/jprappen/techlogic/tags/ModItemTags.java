package net.jprappen.techlogic.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    public static final TagKey<Item> INGOTS_TAG = ItemTags.create(new ResourceLocation("forge", "ingots"));
    public static final TagKey<Item> NUGGETS_TAG = ItemTags.create(new ResourceLocation("forge", "nuggets"));
    public static final TagKey<Item> RAW_MATERIALS_TAG = ItemTags.create(new ResourceLocation("forge", "raw_materials"));

    public static final TagKey<Item> ALUMINIUM_INGOT_TAG = ItemTags.create(new ResourceLocation("forge", "ingots/aluminium"));
    public static final TagKey<Item> ALUMINIUM_NUGGET_TAG = ItemTags.create(new ResourceLocation("forge", "nuggets/aluminium"));
    public static final TagKey<Item> BAUXITE_TAG = ItemTags.create(new ResourceLocation("forge", "raw_materials/bauxite"));
    public static final TagKey<Item> STEEL_INGOT_TAG = ItemTags.create(new ResourceLocation("forge", "ingots/steel"));
    public static final TagKey<Item> STEEL_NUGGET_TAG = ItemTags.create(new ResourceLocation("forge", "ingots/steel"));
}
