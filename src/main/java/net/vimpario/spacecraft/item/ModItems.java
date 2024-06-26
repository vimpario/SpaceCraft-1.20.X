package net.vimpario.spacecraft.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vimpario.spacecraft.SpaceCraft;

public class ModItems {
    public  static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SpaceCraft.MOD_ID);

    public static final RegistryObject<Item> ALUMINIUM = ITEMS.register("aluminium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CUPRUM = ITEMS.register("cuprum",
            () -> new Item((new Item.Properties())));

    public static final RegistryObject<Item> FERRUM = ITEMS.register("ferrum",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WOLFRAMIUM = ITEMS.register("wolframium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHROMIUM = ITEMS.register("chromium",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
