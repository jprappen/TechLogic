package net.jprappen.techlogic.item;

import net.jprappen.techlogic.TechLogic;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    private static final DeferredRegister<CreativeModeTab> TABS_REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TechLogic.MODID);

    public static final RegistryObject<CreativeModeTab> ITEMS_TAB = TABS_REGISTER.register("tab.items", () -> CreativeModeTab.builder().title(Component.translatable("tab.items")).icon(() -> new ItemStack(ModItems.ALUMINIUM_INGOT.get())).displayItems(((itemDisplayParameters, output) -> {
        output.accept(ModItems.ALUMINIUM_INGOT.get());
        output.accept(ModItems.ALUMINIUM_NUGGET.get());
        output.accept(ModItems.BAUXITE.get());
        output.accept(ModItems.STEEL_INGOT.get());
        output.accept(ModItems.STEEL_NUGGET.get());
    })).build());

    public static final RegistryObject<CreativeModeTab> BLOCKS_TAB = TABS_REGISTER.register("tab.blocks", () -> CreativeModeTab.builder().title(Component.translatable("tab.blocks")).withTabsBefore(new ResourceLocation(TechLogic.MODID, "tab.items")).icon(() -> new ItemStack(ModItems.ALUMINIUM_BLOCK.get())).displayItems(((itemDisplayParameters, output) -> {
        output.accept(ModItems.ALUMINIUM_BLOCK.get());
        output.accept(ModItems.BAUXITE_BLOCK.get());
        output.accept(ModItems.BAUXITE_ORE.get());
        output.accept(ModItems.DEEPSLATE_BAUXITE_ORE.get());
        output.accept(ModItems.STEEL_BLOCK.get());
    })).build());

    public static void init(IEventBus eventBus) {
        TABS_REGISTER.register(eventBus);
    }
}
