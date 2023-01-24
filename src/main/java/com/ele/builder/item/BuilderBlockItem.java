package com.ele.builder.item;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BuilderBlockItem extends BlockItem {

    public BuilderBlockItem(Block block) {
        super(block, new BuilderItemSetting());
    }

    public BuilderBlockItem(Block block, Settings settings) {
        super(block, settings);
    }
}
