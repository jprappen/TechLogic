package net.jprappen.techlogic;

import net.jprappen.techlogic.block.ModBlocks;
import net.jprappen.techlogic.item.ModCreativeTabs;
import net.jprappen.techlogic.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

@Mod(TechLogic.MODID)
public class TechLogic
{
    public static final String MODID = "techlogic";

    public TechLogic()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeTabs.init(modEventBus);
        ModBlocks.init(modEventBus);
        ModItems.init(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey().equals(CreativeModeTabs.INGREDIENTS)) {
            event.accept(ModItems.ALUMINIUM_INGOT);
            event.accept(ModItems.ALUMINIUM_NUGGET);
            event.accept(ModItems.BAUXITE);
            event.accept(ModItems.STEEL_INGOT);
            event.accept(ModItems.STEEL_NUGGET);
        }
    }
}
