package net.kraundew.triunx.item;

import net.kraundew.triunx.TriunxMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ItemsMod {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TriunxMod.MOD_ID);

    public static  final RegistryObject<Item> ruby = ITEMS.register(  "ruby", () -> new Item(new Item.Properties()) );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
