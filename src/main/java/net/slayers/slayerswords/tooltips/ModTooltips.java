package net.slayers.slayerswords.tooltips;

import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.locale.Language;
import net.slayers.slayerswords.SlayerSwords;

public class ModTooltips {
    public static void register() {
        ItemTooltipCallback.EVENT.register((stack, context, flag, lines) -> {
            Identifier id = BuiltInRegistries.ITEM.getKey(stack.getItem());
            if (!id.getNamespace().equals(SlayerSwords.MOD_ID)) return;
            String key = "itemTooltip." + id.getNamespace() + "." + id.getPath();
            if (Language.getInstance().has(key)) {
                lines.add(Component.translatable(key).withStyle(ChatFormatting.GRAY));
            }
        });
    }
}
