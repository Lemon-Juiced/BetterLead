package lemon_juice.better_lead.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class BetterLeadTags {
    public static void init() {
        Items.init();
    }

    private BetterLeadTags() {}

    public static class Items {
        private static void init() {
        }

        private Items() {
        }

        public static final TagKey<Item> INGOTS_LEAD = forgeTag("ingots/lead");

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
