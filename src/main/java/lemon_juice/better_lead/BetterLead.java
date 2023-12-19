package lemon_juice.better_lead;

import lemon_juice.better_lead.block.BetterLeadBlocks;
import lemon_juice.better_lead.creativetab.BetterLeadCreativeTab;
import lemon_juice.better_lead.event.BetterLeadEvents;
import lemon_juice.better_lead.item.BetterLeadItems;
import lemon_juice.better_lead.tags.BetterLeadTags;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(BetterLead.MOD_ID)
public class BetterLead {
    public static final String MOD_ID = "better_lead";

    public BetterLead(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);

        // Register Items & Blocks
        BetterLeadItems.register(modEventBus);
        BetterLeadBlocks.register(modEventBus);

        // Register Creative Tab
        BetterLeadCreativeTab.register(modEventBus);
        modEventBus.addListener(BetterLeadCreativeTab::registerTabs);

        // Register Events
        BetterLeadEvents.registerEvents();

        // Register Tags
        BetterLeadTags.init();

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
