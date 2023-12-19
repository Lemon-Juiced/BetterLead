package lemon_juice.better_lead.event;

import lemon_juice.better_lead.item.BetterLeadItems;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.living.LivingKnockBackEvent;

public class BetterLeadEvents {
    public static void registerEvents(){
            NeoForge.EVENT_BUS.<LivingKnockBackEvent>addListener(EventPriority.LOW, event -> {
            final ItemStack bat = event.getEntity().getItemBySlot(EquipmentSlot.MAINHAND);

            if(BetterLeadItems.LEAD_BAT.get().equals(bat.getItem()))
                event.setStrength(event.getStrength() + 0.8F);
        });
    }
}
