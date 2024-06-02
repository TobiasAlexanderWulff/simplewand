package com.gmail.tobrojekt2.simplewand.init;

import com.gmail.tobrojekt2.simplewand.SimpleWand;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            SimpleWand.MODID);

    public static final RegistryObject<Block> SPELL_BENCH_BLOCK = BLOCKS.register("spell_bench_block",
            () -> new Block(Block.Properties.copy(Blocks.CRAFTING_TABLE)));

}
