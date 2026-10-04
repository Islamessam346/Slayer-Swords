package net.slayers.slayerswords.tooltips;

import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.Identifier;
import net.minecraft.locale.Language;
import net.slayers.slayerswords.SlayerSwords;

import java.util.Comparator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModTooltips {
    private static final Map<String, Integer> KEYWORDS = Map.of(
            "revenge", 0xff0000,
            "muzan", 0x000000,
            "demon", 0xff0000,
            "sun", 0xffff00
    );

    private static final Pattern PATTERN = Pattern.compile(
            "\\b(" + String.join("|", KEYWORDS.keySet().stream()
                    .sorted(Comparator.comparingInt(String::length).reversed())
                    .toList()) + ")\\b",
            Pattern.CASE_INSENSITIVE);

    public static void register() {
        ItemTooltipCallback.EVENT.register((stack, context, flag, lines) -> {
            Identifier id = BuiltInRegistries.ITEM.getKey(stack.getItem());
            if (!id.getNamespace().equals(SlayerSwords.MOD_ID)) return;
            String key = "itemTooltip." + id.getNamespace() + "." + id.getPath();
            if (Language.getInstance().has(key)) {
                lines.add(colorize(Language.getInstance().getOrDefault(key)));
            }
        });
    }

    private static MutableComponent colorize(String text) {
        MutableComponent result = Component.empty();
        Matcher matcher = PATTERN.matcher(text);
        int last = 0;
        while (matcher.find()) {
            result.append(Component.literal(text.substring(last, matcher.start()))
                    .withStyle(ChatFormatting.GRAY));
            int color = KEYWORDS.get(matcher.group().toLowerCase());
            result.append(Component.literal(matcher.group())
                    .withStyle(style -> style.withColor(color)));
            last = matcher.end();
        }
        result.append(Component.literal(text.substring(last)).withStyle(ChatFormatting.GRAY));
        return result;
    }
}
