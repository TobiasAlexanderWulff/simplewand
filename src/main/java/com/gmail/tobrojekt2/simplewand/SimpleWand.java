package com.gmail.tobrojekt2.simplewand;

import com.gmail.tobrojekt2.simplewand.init.BlockInit;
import com.gmail.tobrojekt2.simplewand.init.CreativeTabInit;
import com.gmail.tobrojekt2.simplewand.init.ItemInit;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SimpleWand.MODID)
public class SimpleWand {
    public static final String MODID = "simplewand";

    public SimpleWand() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        CreativeTabInit.CREATIVE_TABS.register(modEventBus);
    }

}
