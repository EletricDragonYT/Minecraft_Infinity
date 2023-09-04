package com.electric.infinity.Registry.CreativeTabs;

import com.electric.infinity.Infinity;
import com.electric.infinity.Registry.Blocks.Blocks;
import com.electric.infinity.Registry.Items.Items;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Infinity.MODID);

    public static final RegistryObject<CreativeModeTab> TEST_TAB = CREATIVE_MODE_TABS.register("test_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.TEST_ITEM.get()))
                    .title(Component.translatable("creativetab.test_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Items.TEST_ITEM.get());
                        pOutput.accept(Blocks.TEST_BLOCK.get());
                        pOutput.accept(Blocks.TEST_STAIRS.get());
                        pOutput.accept(Blocks.TEST_SLAB.get());
                        pOutput.accept(Blocks.TEST_FENCE.get());
                        pOutput.accept(Blocks.TEST_FENCE_GATE.get());
                        pOutput.accept(Blocks.TEST_WALL.get());
                        pOutput.accept(Blocks.TEST_DOOR.get());
                        pOutput.accept(Blocks.TEST_TRAPDOOR.get());

                        // Below is an example of adding a Vanilla item into this creative tab.
                        //pOutput.accept(Items.SPAWNER.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {

        CREATIVE_MODE_TABS.register(eventBus);
    }
}
