package net.slayers.slayerswords.datagen;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementType;
import net.minecraft.advancements.predicates.ItemPredicate;
import net.minecraft.advancements.triggers.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.advancements.AdvancementProvider;
import net.minecraft.data.advancements.AdvancementSubProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.slayers.slayerswords.SlayerSwords;
import net.slayers.slayerswords.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementsProvider extends AdvancementProvider {
    public ModAdvancementsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, List.of(new SlayerSwordsAdvancements()));
    }

    public static class SlayerSwordsAdvancements implements AdvancementSubProvider {
        @Override
        public void generate(HolderLookup.Provider registries, Consumer<AdvancementHolder> output) {
            var items = registries.lookupOrThrow(Registries.ITEM);
            var blocks = registries.lookupOrThrow(Registries.BLOCK);

            AdvancementHolder root = Advancement.Builder.advancement()
                    .display(
                            ModItems.SUN_ORE,
                            Component.translatable("advancements.slayerswords.root.title"),
                            Component.translatable("advancements.slayerswords.root.description"),
                            Identifier.withDefaultNamespace("gui/advancements/backgrounds/adventure"),
                            AdvancementType.TASK,
                            false,
                            false,
                            false
                    )
                    .addCriterion("has_sun_ore", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(items, ModItems.SUN_ORE)))
                    .save(output, SlayerSwords.MOD_ID + ":slayerswords/root");

            AdvancementHolder basic = Advancement.Builder.advancement()
                    .parent(root)
                    .display(
                            ModItems.BASIC_NICHIRIN,
                            Component.translatable("advancements.slayerswords.basic.title"),
                            Component.translatable("advancements.slayerswords.basic.description"),
                            null,
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    )
                    .addCriterion("has_basic_nichirin", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(items, ModItems.BASIC_NICHIRIN)))
                    .save(output, SlayerSwords.MOD_ID + ":slayerswords/basic");

            AdvancementHolder basic_flame = Advancement.Builder.advancement()
                    .parent(basic)
                    .display(
                            ModItems.BASIC_NICHIRIN_FLAME,
                            Component.translatable("advancements.slayerswords.basic_flame.title"),
                            Component.translatable("advancements.slayerswords.basic_flame.description"),
                            null,
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    )
                    .addCriterion("has_basic_nichirin_flame", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(items, ModItems.BASIC_NICHIRIN_FLAME)))
                    .save(output, SlayerSwords.MOD_ID + ":slayerswords/basic_flame");

            AdvancementHolder basic_water = Advancement.Builder.advancement()
                    .parent(basic)
                    .display(
                            ModItems.BASIC_NICHIRIN_WATER,
                            Component.translatable("advancements.slayerswords.basic_water.title"),
                            Component.translatable("advancements.slayerswords.basic_water.description"),
                            null,
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    )
                    .addCriterion("has_basic_nichirin_water", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(items, ModItems.BASIC_NICHIRIN_WATER)))
                    .save(output, SlayerSwords.MOD_ID + ":slayerswords/basic_water");

            AdvancementHolder basic_wind = Advancement.Builder.advancement()
                    .parent(basic)
                    .display(
                            ModItems.BASIC_NICHIRIN_WIND,
                            Component.translatable("advancements.slayerswords.basic_wind.title"),
                            Component.translatable("advancements.slayerswords.basic_wind.description"),
                            null,
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    )
                    .addCriterion("has_basic_nichirin_wind", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(items, ModItems.BASIC_NICHIRIN_WIND)))
                    .save(output, SlayerSwords.MOD_ID + ":slayerswords/basic_wind");

            AdvancementHolder basic_thunder = Advancement.Builder.advancement()
                    .parent(basic)
                    .display(
                            ModItems.BASIC_NICHIRIN_THUNDER,
                            Component.translatable("advancements.slayerswords.basic_thunder.title"),
                            Component.translatable("advancements.slayerswords.basic_thunder.description"),
                            null,
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    )
                    .addCriterion("has_basic_nichirin_thunder", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(items, ModItems.BASIC_NICHIRIN_THUNDER)))
                    .save(output, SlayerSwords.MOD_ID + ":slayerswords/basic_thunder");

            AdvancementHolder basic_stone = Advancement.Builder.advancement()
                    .parent(basic)
                    .display(
                            ModItems.BASIC_NICHIRIN_STONE,
                            Component.translatable("advancements.slayerswords.basic_stone.title"),
                            Component.translatable("advancements.slayerswords.basic_stone.description"),
                            null,
                            AdvancementType.TASK,
                            true,
                            true,
                            false
                    )
                    .addCriterion("has_basic_nichirin_stone", InventoryChangeTrigger.TriggerInstance.hasItems(
                            ItemPredicate.Builder.item().of(items, ModItems.BASIC_NICHIRIN_STONE)))
                    .save(output, SlayerSwords.MOD_ID + ":slayerswords/basic_stone");
        }
    }
}
