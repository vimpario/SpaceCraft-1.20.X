package net.vimpario.spacecraft;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.vimpario.spacecraft.block.ModBlocks;
import net.vimpario.spacecraft.item.ModCreativeModTabs;
import net.vimpario.spacecraft.item.ModItems;
import org.slf4j.Logger;


@Mod(SpaceCraft.MOD_ID)
public class SpaceCraft
{

    public static final String MOD_ID = "spacecraft";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SpaceCraft()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);



        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    //ksdjfhjhjdshf
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.ALUMINIUM);
            event.accept(ModItems.FERRUM);
            event.accept(ModItems.CHROMIUM);
            event.accept(ModItems.CUPRUM);
            event.accept(ModItems.WOLFRAMIUM);

        }

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(ModBlocks.ALUMINIUM_BLOCK);
            event.accept(ModBlocks.CHROMIUM_BLOCK);
            event.accept(ModBlocks.CUPRUM_BLOCK);
            event.accept(ModBlocks.FERRUM_BLOCK);
            event.accept(ModBlocks.WOLFRAMIUM_BLOCK);
        }
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
