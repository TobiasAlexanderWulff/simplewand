package com.gmail.tobrojekt2.simplewand.init;

import com.gmail.tobrojekt2.simplewand.SimpleWand;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        SimpleWand.MODID);

        public static final RegistryObject<Item> WAND_ITEM = ITEMS.register("wand",
                        () -> new Item(new Item.Properties()
                                        .rarity(Rarity.EPIC)));

        public static final RegistryObject<BlockItem> SPELL_BENCH_BLOCK_ITEM = ITEMS.register("spell_bench_block",
                        () -> new BlockItem(BlockInit.SPELL_BENCH_BLOCK.get(),
                                        new Item.Properties()
                                                        .rarity(Rarity.UNCOMMON)));
}
