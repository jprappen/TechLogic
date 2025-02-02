package net.jprappen.techlogic.item;

import net.jprappen.techlogic.TechLogic;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, TechLogic.MODID);

    public static final RegistryObject<Item> ALUMINIUM_INGOT= ITEMS_REGISTER.register("aluminium_ingot", () -> new Item(new Item.Properties()));

    public static void init(IEventBus eventBus) {
        ITEMS_REGISTER.register(eventBus);
    }
}
