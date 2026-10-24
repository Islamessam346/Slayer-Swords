package net.slayers.slayerswords.tags;

import net.slayers.slayerswords.SlayerSwords;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;

import javax.swing.text.html.HTML;


public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_BASIC_TOOL = createTag("incorrect_for_basic_tool");
        public static final TagKey<Block> INCORRECT_FOR_DEMON_TOOL = createTag("incorrect_for_demon_tool");
        public static final TagKey<Block> NEEDS_DEMON_TOOL = createTag("needs_demon_tool");
        public static final TagKey<Block> INCORRECT_FOR_HASHIRA_TOOL = createTag("incorrect_for_hashira_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> BASIC_REPAIR = createTag("basic_repair");
        public static final TagKey<Item> SUN_REPAIR = createTag("sun_repair");
        public static final TagKey<Item> DEMON_REPAIR = createTag("demon_repair");
        public static final TagKey<Item> HASHIRA_REPAIR = createTag("hashira_repair");
        public static final TagKey<Item> SOUND_REPAIR = createTag("sound_repair");
        public static final TagKey<Item> WIND_REPAIR = createTag("wind_repair");
        public static final TagKey<Item> WATER_REPAIR = createTag("water_repair");
        public static final TagKey<Item> MIST_REPAIR = createTag("mist_repair");
        public static final TagKey<Item> FLAME_REPAIR = createTag("flame_repair");
        public static final TagKey<Item> LOVE_REPAIR = createTag("love_repair");
        public static final TagKey<Item> SERPENT_REPAIR = createTag("serpent_repair");
        public static final TagKey<Item> LIGHTNING_REPAIR = createTag("lightning_repair");



        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name));
        }
    }
}