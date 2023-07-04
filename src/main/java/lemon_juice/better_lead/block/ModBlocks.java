package lemon_juice.better_lead.block;

import lemon_juice.better_lead.BetterLead;
import lemon_juice.better_lead.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterLead.MOD_ID);

    public static final RegistryObject<Block> LEAD_ORE = registerBlock("lead_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(LEAD_ORE.get()).requiresCorrectToolForDrops().strength(4.5F, 3.0F)));
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

    /******************************** Registry ********************************/
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
