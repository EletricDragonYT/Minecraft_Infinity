package com.electric.infinity.Registry.Items;

import com.electric.infinity.Infinity;
import com.electric.infinity.Registry.Blocks.Blocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Infinity.MODID);

    // Test Items
    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new Item(new Item.Properties()));

    // Test Blocks
    public static final RegistryObject<BlockItem> TEST_BLOCK = ITEMS.register("test_block",
            () -> new BlockItem(Blocks.TEST_BLOCK.get(), new Item.Properties()
                    .stacksTo(64)));
    public static final RegistryObject<BlockItem> TEST_STAIRS = ITEMS.register("test_stairs",
            () -> new BlockItem(Blocks.TEST_STAIRS.get(), new Item.Properties()
                    .stacksTo(64)));
    public static final RegistryObject<BlockItem> TEST_SLAB = ITEMS.register("test_slab",
            () -> new BlockItem(Blocks.TEST_SLAB.get(), new Item.Properties()
                    .stacksTo(64)));
    public static final RegistryObject<BlockItem> TEST_FENCE = ITEMS.register("test_fence",
            () -> new BlockItem(Blocks.TEST_FENCE.get(), new Item.Properties()
                    .stacksTo(64)));
    public static final RegistryObject<BlockItem> TEST_FENCE_GATE = ITEMS.register("test_fence_gate",
            () -> new BlockItem(Blocks.TEST_FENCE_GATE.get(), new Item.Properties()
                   .stacksTo(64)));
    public static final RegistryObject<BlockItem> TEST_WALL = ITEMS.register("test_wall",
            () -> new BlockItem(Blocks.TEST_WALL.get(), new Item.Properties()
                    .stacksTo(64)));
    public static final RegistryObject<BlockItem> TEST_DOOR = ITEMS.register("test_door",
            () -> new BlockItem(Blocks.TEST_DOOR.get(), new Item.Properties()
                    .stacksTo(64)));
    public static final RegistryObject<BlockItem> TEST_TRAPDOOR = ITEMS.register("test_trapdoor",
            () -> new BlockItem(Blocks.TEST_TRAPDOOR.get(), new Item.Properties()
                    .stacksTo(64)));

    // |
    // |
    // |
    // Dirt Items

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}