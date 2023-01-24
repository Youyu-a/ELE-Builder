package com.ele.builder.registry;

import com.ele.builder.BuilderMod;
import com.ele.builder.block.VerticalSlab;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public enum Blocks {

    //木
    VERTICAL_OAK_SLAB("vertical_oak_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.OAK_SLAB))),
    VERTICAL_DARK_OAK_SLAB("vertical_dark_oak_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.DARK_OAK_SLAB))),
    VERTICAL_BIRCH_SLAB("vertical_birch_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.BIRCH_SLAB))),
    VERTICAL_JUNGLE_SLAB("vertical_jungle_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.JUNGLE_SLAB))),
    VERTICAL_ACACIA_SLAB("vertical_acacia_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.ACACIA_SLAB))),
    VERTICAL_MANGROVE_SLAB("vertical_mangrove_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.MANGROVE_SLAB))),
    VERTICAL_CRIMSON_SLAB("vertical_crimson_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.CRIMSON_SLAB))),
    VERTICAL_SPRUCE_SLAB("vertical_spruce_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.SPRUCE_SLAB))),
    VERTICAL_WARPED_SLAB("vertical_warped_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.WARPED_SLAB))),
    //石
    VERTICAL_STONE_SLAB("vertical_stone_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.STONE_SLAB).requiresTool())),
    VERTICAL_QUARTZ_SLAB("vertical_quartz_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.QUARTZ_SLAB).requiresTool())),
    VERTICAL_SMOOTH_QUARTZ_SLAB("vertical_smooth_quartz_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.SMOOTH_QUARTZ_SLAB).requiresTool())),
    VERTICAL_PURPUR_SLAB("vertical_purpur_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.PURPUR_SLAB).requiresTool())),
    VERTICAL_BLACKSTONE_SLAB("vertical_blackstone_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.BLACKSTONE_SLAB).requiresTool())),
    VERTICAL_POLISHED_BLACKSTONE_SLAB("vertical_polished_blackstone_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.POLISHED_BLACKSTONE_SLAB).requiresTool())),
    VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB("vertical_polished_blackstone_brick_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.POLISHED_BLACKSTONE_BRICK_SLAB).requiresTool())),
    VERTICAL_PRISMARINE_SLAB("vertical_prismarine_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.PRISMARINE_SLAB).requiresTool())),
    VERTICAL_DARK_PRISMARINE_SLAB("vertical_dark_prismarine_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.DARK_PRISMARINE_SLAB).requiresTool())),
    VERTICAL_PRISMARINE_BRICK_SLAB("vertical_prismarine_brick_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.PRISMARINE_BRICK_SLAB).requiresTool())),
    VERTICAL_SANDSTONE_SLAB("vertical_sandstone_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.SANDSTONE_SLAB).requiresTool())),
    VERTICAL_RED_SANDSTONE_SLAB("vertical_red_sandstone_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.RED_SANDSTONE_SLAB).requiresTool())),
    VERTICAL_CUT_SANDSTONE_SLAB("vertical_cut_sandstone_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.CUT_SANDSTONE_SLAB).requiresTool())),
    VERTICAL_CUT_RED_SANDSTONE_SLAB("vertical_cut_red_sandstone_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.CUT_RED_SANDSTONE_SLAB).requiresTool())),
    VERTICAL_SMOOTH_SANDSTONE_SLAB("vertical_smooth_sandstone_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.SMOOTH_SANDSTONE_SLAB).requiresTool())),
    VERTICAL_SMOOTH_RED_SANDSTONE_SLAB("vertical_smooth_red_sandstone_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.SMOOTH_RED_SANDSTONE_SLAB).requiresTool())),
    VERTICAL_BRICK_SLAB("vertical_brick_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.BRICK_SLAB).requiresTool())),
    VERTICAL_NETHER_BRICK_SLAB("vertical_nether_brick_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.NETHER_BRICK_SLAB).requiresTool())),
    VERTICAL_RED_NETHER_BRICK_SLAB("vertical_red_nether_brick_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.RED_NETHER_BRICK_SLAB).requiresTool())),
    VERTICAL_MUD_BRICK_SLAB("vertical_mud_brick_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.MUD_BRICK_SLAB).requiresTool())),
    VERTICAL_ANDESITE_SLAB("vertical_andesite_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.ANDESITE_SLAB).requiresTool())),
    VERTICAL_POLISHED_ANDESITE_SLAB("vertical_polished_andesite_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.POLISHED_ANDESITE_SLAB).requiresTool())),
    VERTICAL_DIORITE_SLAB("vertical_diorite_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.DIORITE_SLAB).requiresTool())),
    VERTICAL_COBBLED_DEEPSLATE_SLAB("vertical_cobbled_deepslate_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.COBBLED_DEEPSLATE_SLAB).requiresTool())),
    VERTICAL_DEEPSLATE_BRICK_SLAB("vertical_deepslate_brick_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.DEEPSLATE_BRICK_SLAB).requiresTool())),
    VERTICAL_DEEPSLATE_TILE_SLAB("vertical_deepslate_tile_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.DEEPSLATE_TILE_SLAB).requiresTool())),
    VERTICAL_POLISHED_DEEPSLATE_SLAB("vertical_polished_deepslate_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.POLISHED_DEEPSLATE_SLAB).requiresTool())),
    VERTICAL_POLISHED_DIORITE_SLAB("vertical_polished_diorite_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.POLISHED_DIORITE_SLAB).requiresTool())),
    VERTICAL_GRANITE_SLAB("vertical_granite_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.POLISHED_GRANITE_SLAB).requiresTool())),
    VERTICAL_POLISHED_GRANITE_SLAB("vertical_polished_granite_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.GRANITE_SLAB).requiresTool())),
    VERTICAL_STONE_BRICK_SLAB("vertical_stone_brick_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.STONE_BRICK_SLAB).requiresTool())),
    VERTICAL_END_STONE_BRICK_SLAB("vertical_end_stone_brick_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.END_STONE_BRICK_SLAB).requiresTool())),
    VERTICAL_MOSSY_STONE_BRICK_SLAB("vertical_mossy_stone_brick_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.MOSSY_STONE_BRICK_SLAB).requiresTool())),
    VERTICAL_SMOOTH_STONE_SLAB("vertical_smooth_stone_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.SMOOTH_STONE_SLAB).requiresTool())),
    VERTICAL_COBBLESTONE_SLAB("vertical_cobblestone_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.COBBLESTONE_SLAB).requiresTool())),
    VERTICAL_MOSSY_COBBLESTONE_SLAB("vertical_mossy_cobblestone_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.MOSSY_COBBLESTONE_SLAB).requiresTool())),
    VERTICAL_WAXED_CUT_COPPER_SLAB("vertical_waxed_cut_copper_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.WAXED_CUT_COPPER_SLAB).requiresTool())),
    VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB("vertical_waxed_oxidized_cut_copper_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB).requiresTool())),
    VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB("vertical_waxed_weathered_cut_copper_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB).requiresTool())),
    VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB("vertical_waxed_exposed_cut_copper_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB).requiresTool())),
    VERTICAL_CUT_COPPER_SLAB("vertical_cut_copper_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.CUT_COPPER_SLAB).requiresTool())),
    VERTICAL_OXIDIZED_CUT_COPPER_SLAB("vertical_oxidized_cut_copper_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.OXIDIZED_CUT_COPPER_SLAB).requiresTool())),
    VERTICAL_WEATHERED_CUT_COPPER_SLAB("vertical_weathered_cut_copper_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.WEATHERED_CUT_COPPER_SLAB).requiresTool())),
    VERTICAL_EXPOSED_CUT_COPPER_SLAB("vertical_exposed_cut_copper_slab",() -> new VerticalSlab(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.EXPOSED_CUT_COPPER_SLAB).requiresTool()))
    ;

    private final String id;
    private final Supplier<Block> blockSupplier;
    private Block block;



    Blocks(String id,Supplier<Block> blockSupplier){
        this.id = id;
        this.blockSupplier = blockSupplier;
    }

    public static void registerAll(){
        for (Blocks value : values()){
            Registry.register(Registries.BLOCK,new Identifier(BuilderMod.MOD_ID,value.id),value.get());
        }
    }

    public Block get(){
        if(block == null){
            block = blockSupplier.get();
        }
        return block;
    }

    public String getId(){
        return Registries.BLOCK.getId(get()).toString();
    }
}
