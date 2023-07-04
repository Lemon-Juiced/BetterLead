package lemon_juice.better_lead.creativetab;

import lemon_juice.better_lead.BetterLead;
import lemon_juice.better_lead.block.ModBlocks;
import lemon_juice.better_lead.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterLead.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BETTER_LEAD_TAB = CREATIVE_MODE_TABS.register("better_lead", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.better_lead"))
            .icon(() -> new ItemStack(ModItems.LEAD_SWORD.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == BETTER_LEAD_TAB.get()) {
            event.accept(ModItems.LEAD_SWORD.get());
            event.accept(ModItems.LEAD_SHOVEL.get());
            event.accept(ModItems.LEAD_PICKAXE.get());
            event.accept(ModItems.LEAD_AXE.get());
            event.accept(ModItems.LEAD_HOE.get());
            event.accept(ModItems.LEAD_BAT.get());

            event.accept(ModItems.LEAD_HELMET.get());
            event.accept(ModItems.LEAD_CHESTPLATE.get());
            event.accept(ModItems.LEAD_LEGGINGS.get());
            event.accept(ModItems.LEAD_BOOTS.get());

            event.accept(ModItems.RAW_LEAD.get());

            event.accept(ModBlocks.LEAD_ORE.get());
            event.accept(ModBlocks.DEEPSLATE_LEAD_ORE.get());
            event.accept(ModBlocks.RAW_LEAD_BLOCK.get());
        }
    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
