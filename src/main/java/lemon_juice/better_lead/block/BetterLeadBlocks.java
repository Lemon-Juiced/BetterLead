package lemon_juice.better_lead.block;

import lemon_juice.better_lead.BetterLead;
import lemon_juice.better_lead.item.BetterLeadItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BetterLeadBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BetterLead.MOD_ID);

    public static final DeferredBlock<Block> LEAD_ORE = registerBlock("lead_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(LEAD_ORE.get()).requiresCorrectToolForDrops().strength(4.5F, 3.0F)));
    public static final DeferredBlock<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

    /******************************** Registry ********************************/
    public static <T extends Block> DeferredBlock<Block> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<Block> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredItem<BlockItem> registerBlockItem(String name, DeferredBlock<Block> block) {
        return BetterLeadItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
