package lemon_juice.better_lead.item;

import lemon_juice.better_lead.BetterLead;
import lemon_juice.better_lead.item.custom.tiers.BetterLeadArmorMaterials;
import lemon_juice.better_lead.item.custom.tools.*;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BetterLeadItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterLead.MOD_ID);

    public static final DeferredItem<Item> RAW_LEAD = ITEMS.register("raw_lead", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> LEAD_SWORD = ITEMS.register("lead_sword", () -> new LeadSwordItem(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_SHOVEL = ITEMS.register("lead_shovel", () -> new LeadShovelItem(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_PICKAXE = ITEMS.register("lead_pickaxe", () -> new LeadPickaxeItem(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_AXE = ITEMS.register("lead_axe", () -> new LeadAxeItem(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_HOE = ITEMS.register("lead_hoe", () -> new LeadHoeItem(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_BAT = ITEMS.register("lead_bat", () -> new LeadBatItem(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_HELMET = ITEMS.register("lead_helmet", () -> new ArmorItem(BetterLeadArmorMaterials.LEAD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final DeferredItem<Item> LEAD_CHESTPLATE = ITEMS.register("lead_chestplate", () -> new ArmorItem(BetterLeadArmorMaterials.LEAD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final DeferredItem<Item> LEAD_LEGGINGS = ITEMS.register("lead_leggings", () -> new ArmorItem(BetterLeadArmorMaterials.LEAD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final DeferredItem<Item> LEAD_BOOTS = ITEMS.register("lead_boots", () -> new ArmorItem(BetterLeadArmorMaterials.LEAD, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
