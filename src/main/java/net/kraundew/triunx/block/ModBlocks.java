package net.kraundew.triunx.block;

import net.kraundew.triunx.TriunxMod;
import net.kraundew.triunx.item.ItemsMod;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static  final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TriunxMod.MOD_ID);
    //Create Block
    public static  final RegistryObject<Block> ruby_ore = registerBlock("ruby_ore",
            ()->new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).strength(2.5f).requiresCorrectToolForDrops(), UniformInt.of( 2, 6)));
    //Register Item and Block
    private static  <T extends  Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ItemsMod.ITEMS.register(name, ()->new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
