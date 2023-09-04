package com.electric.infinity.Registry.Blocks;

import com.electric.infinity.Infinity;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Blocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Infinity.MODID);

    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.0f)));
    public static final RegistryObject<Block> TEST_STAIRS = BLOCKS.register("test_stairs",
            () -> new StairBlock(TEST_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.0f)));
    public static final RegistryObject<Block> TEST_SLAB = BLOCKS.register("test_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.0f)));
    public static final RegistryObject<Block> TEST_FENCE = BLOCKS.register("test_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .forceSolidOn()
                    .strength(1.0f, 1.0f)));
    public static final RegistryObject<Block> TEST_FENCE_GATE = BLOCKS.register("test_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of()
                    .forceSolidOn()
                    .strength(1.0f, 1.0f),
                    WoodType.OAK));
    public static final RegistryObject<Block> TEST_WALL = BLOCKS.register("test_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .forceSolidOn()
                    .strength(0.5f, 0.5f)));

    public static final RegistryObject<Block> TEST_DOOR = BLOCKS.register("test_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of()
                    .strength(0.5f, 0.5f)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> TEST_TRAPDOOR = BLOCKS.register("test_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of()
                    .strength(0.5f, 0.5f)
                    .noOcclusion()
                    .pushReaction(PushReaction.DESTROY),
                    BlockSetType.OAK));

    /*
    public static final RegistryObject<Block> TEST_PRESSURE_PLATE = BLOCKS.register("test_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of().sound(SoundType.ANVIL), BlockSetType.IRON,
                    .strength(1.0f, 1.0f)
                    .noCollision()));

    public static final RegistryObject<Block> TEST_DOOR = BLOCKS.register("test_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.0f)
                    .noOcclusion()));
    public static final RegistryObject<Block> TEST_TRAPDOOR = BLOCKS.register("test_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.0f)
                    .noOcclusion()));

    public static final RegistryObject<Block> TEST_BLOCK2 = BLOCKS.register("test_block2",
            () -> new CraftingTableBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f, 1.0f)));*/

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
