package com.gmail.tobrojekt2.simplewand.init;

import com.gmail.tobrojekt2.simplewand.SimpleWand;
import static com.gmail.tobrojekt2.simplewand.init.CreativeTabInit.addToTab;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        SimpleWand.MODID);

        public static final RegistryObject<Item> WAND_ITEM = addToTab(ITEMS.register("wand",
                        () -> new Item(new Item.Properties()
                                        .stacksTo(1)
                                        .rarity(Rarity.EPIC)
                        )));

        public static final RegistryObject<BlockItem> SPELL_BENCH_ITEM = addToTab(ITEMS.register("spell_bench",
                        () -> new BlockItem(BlockInit.SPELL_BENCH.get(),
                                        new Item.Properties()
                                                        .rarity(Rarity.UNCOMMON)
                        )));
}
