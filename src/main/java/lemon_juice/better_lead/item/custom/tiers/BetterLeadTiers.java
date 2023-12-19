package lemon_juice.better_lead.item.custom.tiers;

import lemon_juice.better_lead.BetterLead;
import lemon_juice.better_lead.tags.BetterLeadTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.TierSortingRegistry;

import java.util.List;

public class BetterLeadTiers {
    /* WOOD(0, 59, 2.0F, 0.0F, 15, () -> {return Ingredient.of(ItemTags.PLANKS);}),
     * STONE(1, 131, 4.0F, 1.0F, 5, () -> {return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);}),
     * IRON(2, 250, 6.0F, 2.0F, 14, () -> {return Ingredient.of(Items.IRON_INGOT);}),
     * DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {return Ingredient.of(Items.DIAMOND);}),
     * GOLD(0, 32, 12.0F, 0.0F, 22, () -> {return Ingredient.of(Items.GOLD_INGOT);}),
     * NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {return Ingredient.of(Items.NETHERITE_INGOT);});
     */

    public static final Tier LEAD_TIER = TierSortingRegistry.registerTier(new SimpleTier(2, 800, 3.0F, 1.0F,18, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(BetterLeadTags.Items.INGOTS_LEAD)), new ResourceLocation(BetterLead.MOD_ID, "lead"), List.of(Tiers.WOOD), List.of(Tiers.IRON));
}
