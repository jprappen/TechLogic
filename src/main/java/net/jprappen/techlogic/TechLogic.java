package net.jprappen.techlogic;

import net.jprappen.techlogic.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TechLogic.MODID)
public class TechLogic
{
    public static final String MODID = "techlogic";

    public TechLogic()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.init(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
