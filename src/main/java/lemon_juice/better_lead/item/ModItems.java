package lemon_juice.better_lead.item;

import lemon_juice.better_lead.BetterLead;
import lemon_juice.better_lead.item.custom.tiers.ModArmorMaterials;
import lemon_juice.better_lead.item.custom.tools.*;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterLead.MOD_ID);

    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LEAD_SWORD = ITEMS.register("lead_sword", () -> new LeadSwordItem(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_SHOVEL = ITEMS.register("lead_shovel", () -> new LeadShovelItem(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_PICKAXE = ITEMS.register("lead_pickaxe", () -> new LeadPickaxeItem(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_AXE = ITEMS.register("lead_axe", () -> new LeadAxeItem(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_HOE = ITEMS.register("lead_hoe", () -> new LeadHoeItem(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_BAT = ITEMS.register("lead_bat", () -> new LeadBatItem(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_HELMET = ITEMS.register("lead_helmet", () -> new ArmorItem(ModArmorMaterials.LEAD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> LEAD_CHESTPLATE = ITEMS.register("lead_chestplate", () -> new ArmorItem(ModArmorMaterials.LEAD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> LEAD_LEGGINGS = ITEMS.register("lead_leggings", () -> new ArmorItem(ModArmorMaterials.LEAD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> LEAD_BOOTS = ITEMS.register("lead_boots", () -> new ArmorItem(ModArmorMaterials.LEAD, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
