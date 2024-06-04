package com.gmail.tobrojekt2.simplewand.init;

import com.gmail.tobrojekt2.simplewand.SimpleWand;
import static com.gmail.tobrojekt2.simplewand.init.CreativeTabInit.addToTab;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SimpleWand.MODID);

        public static final RegistryObject<Item> WAND_ITEM = addToTab(ITEMS.register("wand",
                () -> new Item(new Item.Properties()
                        .stacksTo(1)
        )));

        public static final RegistryObject<Item> SOUL_ITEM = addToTab(ITEMS.register("soul",
                () -> new Item(new Item.Properties()
                        .stacksTo(16)
        )));

        public static final RegistryObject<BlockItem> SPELL_BENCH_ITEM = addToTab(ITEMS.register("spell_bench",
                () -> new BlockItem(BlockInit.SPELL_BENCH.get(),
                        new Item.Properties()
        )));

        
        public static final RegistryObject<BlockItem> AMETHYST_ORE_ITEM = addToTab(ITEMS.register("amethyst_ore",
                () -> new BlockItem(BlockInit.AMETHYST_ORE.get(),
                        new Item.Properties()
        )));
        
        public static final RegistryObject<BlockItem> DEEPSLATE_AMETHYST_ORE_ITEM = addToTab(ITEMS.register("deepslate_amethyst_ore",
                () -> new BlockItem(BlockInit.DEEPSLATE_AMETHYST_ORE.get(),
                        new Item.Properties()
        )));
                
        public static final RegistryObject<BlockItem> NETHER_AMETHYST_ORE_ITEM = addToTab(ITEMS.register("nether_amethyst_ore",
                () -> new BlockItem(BlockInit.NETHER_AMETHYST_ORE.get(),
                        new Item.Properties()
        )));
        
        public static final RegistryObject<BlockItem> END_AMETHYST_ORE_ITEM = addToTab(ITEMS.register("end_amethyst_ore",
                () -> new BlockItem(BlockInit.END_AMETHYST_ORE.get(),
                        new Item.Properties()
        )));

}
