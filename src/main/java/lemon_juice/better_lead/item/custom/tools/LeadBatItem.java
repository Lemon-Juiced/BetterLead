package lemon_juice.better_lead.item.custom.tools;

import lemon_juice.better_lead.item.custom.tiers.ModTiers;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LeadBatItem extends SwordItem {
    public LeadBatItem(Properties properties) {
        super(ModTiers.LEAD_TIER, 1, -2.4F, properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        components.add(Component.translatable("tooltip.better_lead.additional_knockback"));
    }
}
