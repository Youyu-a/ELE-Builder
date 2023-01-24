package com.ele.builder;

import com.ele.builder.registry.Blocks;
import com.ele.builder.registry.Items;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuilderMod implements ModInitializer {

	public static final String MOD_ID = "builder";
	public static final Logger LOGGER = LoggerFactory.getLogger("builder");

	//墙（vertical_slab）
	private static final ItemGroup VERTICAL_GROUP = FabricItemGroup.builder(new Identifier(MOD_ID,"vertical_slab_group"))
			.icon(() -> new ItemStack(Items.VERTICAL_OAK_SLAB.get()))
			.build();


	@Override
	public void onInitialize() {

		LOGGER.info("Welcome to ElementCraft!");
		Items.registerAll();
		Blocks.registerAll();

		ItemGroupEvents.modifyEntriesEvent(VERTICAL_GROUP).register(content -> {
			content.add(Items.VERTICAL_OAK_SLAB.get());
			content.add(Items.VERTICAL_SPRUCE_SLAB.get());
			content.add(Items.VERTICAL_BIRCH_SLAB.get());
			content.add(Items.VERTICAL_JUNGLE_SLAB.get());
			content.add(Items.VERTICAL_ACACIA_SLAB.get());
			content.add(Items.VERTICAL_DARK_OAK_SLAB.get());
			content.add(Items.VERTICAL_MANGROVE_SLAB.get());
			content.add(Items.VERTICAL_CRIMSON_SLAB.get());
			content.add(Items.VERTICAL_WARPED_SLAB.get());

			content.add(Items.VERTICAL_STONE_SLAB.get());
			content.add(Items.VERTICAL_COBBLESTONE_SLAB.get());
			content.add(Items.VERTICAL_MOSSY_COBBLESTONE_SLAB.get());
			content.add(Items.VERTICAL_SMOOTH_STONE_SLAB.get());
			content.add(Items.VERTICAL_STONE_BRICK_SLAB.get());
			content.add(Items.VERTICAL_MOSSY_STONE_BRICK_SLAB.get());
			content.add(Items.VERTICAL_GRANITE_SLAB.get());
			content.add(Items.VERTICAL_POLISHED_GRANITE_SLAB.get());
			content.add(Items.VERTICAL_DIORITE_SLAB.get());
			content.add(Items.VERTICAL_POLISHED_DIORITE_SLAB.get());
			content.add(Items.VERTICAL_ANDESITE_SLAB.get());
			content.add(Items.VERTICAL_POLISHED_ANDESITE_SLAB.get());
			content.add(Items.VERTICAL_COBBLED_DEEPSLATE_SLAB.get());
			content.add(Items.VERTICAL_POLISHED_DEEPSLATE_SLAB.get());
			content.add(Items.VERTICAL_DEEPSLATE_BRICK_SLAB.get());
			content.add(Items.VERTICAL_DEEPSLATE_TILE_SLAB.get());
			content.add(Items.VERTICAL_BRICK_SLAB.get());
			content.add(Items.VERTICAL_MUD_BRICK_SLAB.get());
			content.add(Items.VERTICAL_SANDSTONE_SLAB.get());
			content.add(Items.VERTICAL_SMOOTH_SANDSTONE_SLAB.get());
			content.add(Items.VERTICAL_CUT_SANDSTONE_SLAB.get());
			content.add(Items.VERTICAL_RED_SANDSTONE_SLAB.get());
			content.add(Items.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.get());
			content.add(Items.VERTICAL_CUT_RED_SANDSTONE_SLAB.get());
			content.add(Items.VERTICAL_PRISMARINE_SLAB.get());
			content.add(Items.VERTICAL_PRISMARINE_BRICK_SLAB.get());
			content.add(Items.VERTICAL_DARK_PRISMARINE_SLAB.get());
			content.add(Items.VERTICAL_NETHER_BRICK_SLAB.get());
			content.add(Items.VERTICAL_RED_NETHER_BRICK_SLAB.get());
			content.add(Items.VERTICAL_BLACKSTONE_SLAB.get());
			content.add(Items.VERTICAL_POLISHED_BLACKSTONE_SLAB.get());
			content.add(Items.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.get());
			content.add(Items.VERTICAL_END_STONE_BRICK_SLAB.get());
			content.add(Items.VERTICAL_PURPUR_SLAB.get());
			content.add(Items.VERTICAL_QUARTZ_SLAB.get());
			content.add(Items.VERTICAL_SMOOTH_QUARTZ_SLAB.get());
			content.add(Items.VERTICAL_CUT_COPPER_SLAB.get());
			content.add(Items.VERTICAL_EXPOSED_CUT_COPPER_SLAB.get());
			content.add(Items.VERTICAL_WEATHERED_CUT_COPPER_SLAB.get());
			content.add(Items.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.get());
			content.add(Items.VERTICAL_WAXED_CUT_COPPER_SLAB.get());
			content.add(Items.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.get());
			content.add(Items.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.get());
			content.add(Items.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.get());
		});

	}
}