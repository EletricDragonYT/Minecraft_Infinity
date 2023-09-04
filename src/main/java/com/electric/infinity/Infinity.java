package com.electric.infinity;

import com.electric.infinity.Registry.Blocks.Blocks;
import com.electric.infinity.Registry.CreativeTabs.CreativeTabs;
import com.electric.infinity.Registry.Items.Items;
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
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Infinity.MODID)
public class Infinity {

    public static final String MODID = "infinity";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Infinity() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CreativeTabs.register(modEventBus);

        Items.register(modEventBus);
        Blocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {

    }
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {

            //event.accept(Items.TEST_ITEM); used to add modded items into the vanilla Creative Tabs.
        }
    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
