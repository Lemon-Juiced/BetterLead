package lemon_juice.better_lead.event;

import lemon_juice.better_lead.item.ModItems;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.living.LivingKnockBackEvent;
import net.minecraftforge.eventbus.api.EventPriority;

public class ModEvents {
    public static void registerEvents(){
            MinecraftForge.EVENT_BUS.<LivingKnockBackEvent>addListener(EventPriority.LOW, event -> {
            final ItemStack bat = event.getEntity().getItemBySlot(EquipmentSlot.MAINHAND);

            if(ModItems.LEAD_BAT.orElseThrow(IllegalStateException::new).equals(bat.getItem()))
                event.setStrength(event.getStrength() + 0.8F);
        });
    }
}
