package net.jprappen.techlogic.block;

import net.jprappen.techlogic.TechLogic;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS_REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS, TechLogic.MODID);

    public static final RegistryObject<Block> ALUMINIUM_BLOCK = BLOCKS_REGISTER.register("aluminium_block", () -> new Block(BlockBehaviour.Properties.of().strength(3.2f).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BAUXITE_BLOCK = BLOCKS_REGISTER.register("bauxite_block", () -> new Block(BlockBehaviour.Properties.of().strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BAUXITE_ORE = BLOCKS_REGISTER.register("bauxite_ore", () -> new Block(BlockBehaviour.Properties.of().strength(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEPSLATE_BAUXITE_ORE = BLOCKS_REGISTER.register("deepslate_bauxite_ore", () -> new Block(BlockBehaviour.Properties.of().strength(3.3f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS_REGISTER.register("steel_block", () -> new Block(BlockBehaviour.Properties.of().strength(4f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static void init(IEventBus eventBus) {
        BLOCKS_REGISTER.register(eventBus);
    }
}
