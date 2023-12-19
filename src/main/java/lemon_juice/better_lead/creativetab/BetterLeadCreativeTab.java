package lemon_juice.better_lead.creativetab;

import lemon_juice.better_lead.BetterLead;
import lemon_juice.better_lead.block.BetterLeadBlocks;
import lemon_juice.better_lead.item.BetterLeadItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BetterLeadCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterLead.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BETTER_LEAD_TAB = CREATIVE_MODE_TABS.register("better_lead", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.better_lead"))
            .icon(() -> new ItemStack(BetterLeadItems.LEAD_SWORD.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == BETTER_LEAD_TAB.get()) {
            event.accept(BetterLeadItems.LEAD_SWORD.get());
            event.accept(BetterLeadItems.LEAD_SHOVEL.get());
            event.accept(BetterLeadItems.LEAD_PICKAXE.get());
            event.accept(BetterLeadItems.LEAD_AXE.get());
            event.accept(BetterLeadItems.LEAD_HOE.get());
            event.accept(BetterLeadItems.LEAD_BAT.get());

            event.accept(BetterLeadItems.LEAD_HELMET.get());
            event.accept(BetterLeadItems.LEAD_CHESTPLATE.get());
            event.accept(BetterLeadItems.LEAD_LEGGINGS.get());
            event.accept(BetterLeadItems.LEAD_BOOTS.get());

            event.accept(BetterLeadItems.RAW_LEAD.get());

            event.accept(BetterLeadBlocks.LEAD_ORE.get());
            event.accept(BetterLeadBlocks.DEEPSLATE_LEAD_ORE.get());
            event.accept(BetterLeadBlocks.RAW_LEAD_BLOCK.get());
        }
    }

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
