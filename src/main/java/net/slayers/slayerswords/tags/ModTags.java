package net.slayers.slayerswords.tags;

import net.slayers.slayerswords.SlayerSwords;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;


public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_DEMON_TOOL = createTag("needs_demon_tool");
        public static final TagKey<Block> INCORRECT_FOR_DEMON_TOOL = createTag("incorrect_for_demon_tool");
        public static final TagKey<Block> INCORRECT_FOR_BASIC_TOOL = createTag("incorrect_for_basic_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> DEMON_REPAIR = createTag("demon_repair");
        public static final TagKey<Item> BASIC_REPAIR = createTag("basic_repair");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name));
        }
    }
}