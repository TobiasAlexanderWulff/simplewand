package com.gmail.tobrojekt2.simplewand.init;

import com.gmail.tobrojekt2.simplewand.SimpleWand;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SimpleWand.MODID);

        public static final RegistryObject<Block> SPELL_BENCH = BLOCKS.register("spell_bench",
                () -> new Block(Block.Properties.copy(Blocks.CRAFTING_TABLE)));


        public static final RegistryObject<DropExperienceBlock> AMETHYST_ORE = BLOCKS.register("amethyst_ore",
                () -> new DropExperienceBlock(
                        Block.Properties.copy(Blocks.DIAMOND_ORE),
                        UniformInt.of(4, 5) // Experience range
         ));
              
         public static final RegistryObject<DropExperienceBlock> DEEPSLATE_AMETHYST_ORE = BLOCKS.register("deepslate_amethyst_ore",
                () -> new DropExperienceBlock(
                        Block.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE),
                        UniformInt.of(5, 6)
        ));
              
        public static final RegistryObject<DropExperienceBlock> NETHER_AMETHYST_ORE = BLOCKS.register("nether_amethyst_ore",
                () -> new DropExperienceBlock(
                        Block.Properties.copy(Blocks.NETHER_QUARTZ_ORE),
                        UniformInt.of(6, 7)
        ));
                  
        public static final RegistryObject<DropExperienceBlock> END_AMETHYST_ORE = BLOCKS.register("end_amethyst_ore",
                () -> new DropExperienceBlock(
                        Block.Properties.copy(Blocks.END_STONE),
                        UniformInt.of(7, 8)
        ));            
}
