package com.ele.builder.registry;


import com.ele.builder.BuilderMod;
import com.ele.builder.item.BuilderBlockItem;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public enum Items {

    //木
    VERTICAL_OAK_SLAB("vertical_oak_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_OAK_SLAB.get())),
    VERTICAL_DARK_OAK_SLAB("vertical_dark_oak_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_DARK_OAK_SLAB.get())),
    VERTICAL_BIRCH_SLAB("vertical_birch_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_BIRCH_SLAB.get())),
    VERTICAL_JUNGLE_SLAB("vertical_jungle_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_JUNGLE_SLAB.get())),
    VERTICAL_ACACIA_SLAB("vertical_acacia_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_ACACIA_SLAB.get())),
    VERTICAL_CRIMSON_SLAB("vertical_crimson_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_CRIMSON_SLAB.get())),
    VERTICAL_MANGROVE_SLAB("vertical_mangrove_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_MANGROVE_SLAB.get())),
    VERTICAL_WARPED_SLAB("vertical_warped_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_WARPED_SLAB.get())),
    VERTICAL_SPRUCE_SLAB("vertical_spruce_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_SPRUCE_SLAB.get())),

    //石
    VERTICAL_STONE_SLAB("vertical_stone_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_STONE_SLAB.get())),
    VERTICAL_QUARTZ_SLAB("vertical_quartz_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_QUARTZ_SLAB.get())),
    VERTICAL_SMOOTH_QUARTZ_SLAB("vertical_smooth_quartz_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_SMOOTH_QUARTZ_SLAB.get())),
    VERTICAL_PURPUR_SLAB("vertical_purpur_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_PURPUR_SLAB.get())),
    VERTICAL_BLACKSTONE_SLAB("vertical_blackstone_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_BLACKSTONE_SLAB.get())),
    VERTICAL_POLISHED_BLACKSTONE_SLAB("vertical_polished_blackstone_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_POLISHED_BLACKSTONE_SLAB.get())),
    VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB("vertical_polished_blackstone_brick_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.get())),
    VERTICAL_PRISMARINE_SLAB("vertical_prismarine_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_PRISMARINE_SLAB.get())),
    VERTICAL_PRISMARINE_BRICK_SLAB("vertical_prismarine_brick_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_PRISMARINE_BRICK_SLAB.get())),
    VERTICAL_DARK_PRISMARINE_SLAB("vertical_dark_prismarine_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_DARK_PRISMARINE_SLAB.get())),
    VERTICAL_SANDSTONE_SLAB("vertical_sandstone_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_SANDSTONE_SLAB.get())),
    VERTICAL_RED_SANDSTONE_SLAB("vertical_red_sandstone_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_RED_SANDSTONE_SLAB.get())),
    VERTICAL_CUT_SANDSTONE_SLAB("vertical_cut_sandstone_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_CUT_SANDSTONE_SLAB.get())),
    VERTICAL_CUT_RED_SANDSTONE_SLAB("vertical_cut_red_sandstone_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_CUT_RED_SANDSTONE_SLAB.get())),
    VERTICAL_SMOOTH_RED_SANDSTONE_SLAB("vertical_smooth_red_sandstone_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.get())),
    VERTICAL_SMOOTH_SANDSTONE_SLAB("vertical_smooth_sandstone_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_SMOOTH_SANDSTONE_SLAB.get())),
    VERTICAL_BRICK_SLAB("vertical_brick_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_BRICK_SLAB.get())),
    VERTICAL_NETHER_BRICK_SLAB("vertical_nether_brick_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_NETHER_BRICK_SLAB.get())),
    VERTICAL_RED_NETHER_BRICK_SLAB("vertical_red_nether_brick_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_RED_NETHER_BRICK_SLAB.get())),
    VERTICAL_MUD_BRICK_SLAB("vertical_mud_brick_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_MUD_BRICK_SLAB.get())),
    VERTICAL_ANDESITE_SLAB("vertical_andesite_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_ANDESITE_SLAB.get())),
    VERTICAL_POLISHED_ANDESITE_SLAB("vertical_polished_andesite_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_POLISHED_ANDESITE_SLAB.get())),
    VERTICAL_DIORITE_SLAB("vertical_diorite_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_DIORITE_SLAB.get())),
    VERTICAL_POLISHED_DIORITE_SLAB("vertical_polished_diorite_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_POLISHED_DIORITE_SLAB.get())),
    VERTICAL_GRANITE_SLAB("vertical_granite_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_GRANITE_SLAB.get())),
    VERTICAL_COBBLED_DEEPSLATE_SLAB("vertical_cobbled_deepslate_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_COBBLED_DEEPSLATE_SLAB.get())),
    VERTICAL_DEEPSLATE_BRICK_SLAB("vertical_deepslate_brick_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_DEEPSLATE_BRICK_SLAB.get())),
    VERTICAL_DEEPSLATE_TILE_SLAB("vertical_deepslate_tile_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_DEEPSLATE_TILE_SLAB.get())),
    VERTICAL_POLISHED_DEEPSLATE_SLAB("vertical_polished_deepslate_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_POLISHED_DEEPSLATE_SLAB.get())),
    VERTICAL_POLISHED_GRANITE_SLAB("vertical_polished_granite_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_POLISHED_GRANITE_SLAB.get())),
    VERTICAL_STONE_BRICK_SLAB("vertical_stone_brick_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_STONE_BRICK_SLAB.get())),
    VERTICAL_END_STONE_BRICK_SLAB("vertical_end_stone_brick_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_END_STONE_BRICK_SLAB.get())),
    VERTICAL_MOSSY_STONE_BRICK_SLAB("vertical_mossy_stone_brick_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_MOSSY_STONE_BRICK_SLAB.get())),
    VERTICAL_SMOOTH_STONE_SLAB("vertical_smooth_stone_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_SMOOTH_STONE_SLAB.get())),
    VERTICAL_COBBLESTONE_SLAB("vertical_cobblestone_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_COBBLESTONE_SLAB.get())),
    VERTICAL_CUT_COPPER_SLAB("vertical_cut_copper_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_CUT_COPPER_SLAB.get())),
    VERTICAL_OXIDIZED_CUT_COPPER_SLAB("vertical_oxidized_cut_copper_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.get())),
    VERTICAL_EXPOSED_CUT_COPPER_SLAB("vertical_exposed_cut_copper_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB.get())),
    VERTICAL_WEATHERED_CUT_COPPER_SLAB("vertical_weathered_cut_copper_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB.get())),
    VERTICAL_WAXED_CUT_COPPER_SLAB("vertical_waxed_cut_copper_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_WAXED_CUT_COPPER_SLAB.get())),
    VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB("vertical_waxed_oxidized_cut_copper_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.get())),
    VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB("vertical_waxed_exposed_cut_copper_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.get())),
    VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB("vertical_waxed_weathered_cut_copper_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.get())),
    VERTICAL_MOSSY_COBBLESTONE_SLAB("vertical_mossy_cobblestone_slab",() -> new BuilderBlockItem(Blocks.VERTICAL_MOSSY_COBBLESTONE_SLAB.get()));

    private final String id;
    private final Supplier<Item> itemSupplier;
    private final Integer burnTime;
    private Item item;

    Items(String id, Supplier<Item> itemSupplier){
        this(id,itemSupplier,null);
    }

    Items(String id, Supplier<Item> itemSupplier, Integer burnTime){
        this.id = id;
        this.itemSupplier = itemSupplier;
        this.burnTime =burnTime;
    }

    public static void registerAll(){
        for (Items value : values()){
            Registry.register(Registries.ITEM,new Identifier(BuilderMod.MOD_ID,value.id),value.get());
            if (value.burnTime != null && value.burnTime > 0){
                FuelRegistry.INSTANCE.add(value.get(), value.burnTime);
            }
        }
    }

    public Item get(){
        if(item == null){
            item = itemSupplier.get();
        }
        return item;
    }

    public String getId(){
        return Registries.ITEM.getId(get()).toString();
    }
}
