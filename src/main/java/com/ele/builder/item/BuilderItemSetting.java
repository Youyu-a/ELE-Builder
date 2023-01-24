package com.ele.builder.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class BuilderItemSetting extends FabricItemSettings {

    public static FabricItemSettings builder(){
        return new BuilderItemSetting();
    }
    public BuilderItemSetting(){
        super();
    }
}
