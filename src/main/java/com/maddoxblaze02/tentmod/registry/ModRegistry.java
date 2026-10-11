package com.maddoxblaze02.tentmod.registry;

import com.maddoxblaze02.tentmod.TentMod;
import com.maddoxblaze02.tentmod.block.TentBlock;
import com.maddoxblaze02.tentmod.item.TentItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class ModRegistry {
    public static final Block TENT_BLOCK = new TentBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(2.5F).noOcclusion());
    public static final Item TENT_ITEM = new BlockItem(TENT_BLOCK, new Item.Properties());

    public static void register() {
        Registry.register(BuiltInRegistries.BLOCK, TentMod.id("tent"), TENT_BLOCK);
        Registry.register(BuiltInRegistries.ITEM, TentMod.id("tent"), TENT_ITEM);
    }
}