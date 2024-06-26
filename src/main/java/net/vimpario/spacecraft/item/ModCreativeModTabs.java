package net.vimpario.spacecraft.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.vimpario.spacecraft.SpaceCraft;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpaceCraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SPACECRAFT_TAB = CREATIVE_MODE_TABS.register("spacecraft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_ALUMINIUM.get()))
                    .title(Component.translatable("creativetab.spacecraft_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ALUMINIUM.get());
                        output.accept(ModItems.RAW_ALUMINIUM.get());
                    })
                    .build() );

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
