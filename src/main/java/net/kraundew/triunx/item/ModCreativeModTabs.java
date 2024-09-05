package net.kraundew.triunx.item;

import net.kraundew.triunx.TriunxMod;
import net.kraundew.triunx.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static  final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TriunxMod.MOD_ID);

    public static  final RegistryObject<CreativeModeTab> TriunxTab =
            CREATIVE_MODE_TABS.register( "triunx",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemsMod.ruby.get()))
                            .title(Component.translatable("creativetab.triunx"))
                            .displayItems((pParameters, pOutput) -> {
                                //Others
                                pOutput.accept(ItemsMod.ruby.get());
                                //Ores
                                pOutput.accept(ModBlocks.ruby_ore.get());
                            })
                            .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
