package net.slayers.slayerswords.tooltips;

import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.Identifier;
import net.minecraft.locale.Language;
import net.minecraft.network.chat.Style;
import net.slayers.slayerswords.SlayerSwords;

import java.util.Comparator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModTooltips {
    private static final Map<String, Integer> KEYWORDS = Map.ofEntries(
            Map.entry("lightning", 0xffff00),
            Map.entry("thunder", 0xffff55),
            Map.entry("revenge", 0xff0000),
            Map.entry("serpent", 0xffffff),
            Map.entry("flower", 0xdd44dd),
            Map.entry("marine", 0x0981d1),
            Map.entry("sound", 0xe54141),
            Map.entry("flame", 0xe25822),
            Map.entry("beast", 0xd1f1f9),
            Map.entry("stone", 0x806043),
            Map.entry("water", 0x0000ff),
            Map.entry("toxic", 0x800080),
            Map.entry("demon", 0x7a0006),
            Map.entry("black", 0x333333),
            Map.entry("wind", 0xcadb63),
            Map.entry("mist", 0xcdd8d9),
            Map.entry("love", 0xe48ca3),
            Map.entry("sun", 0xef8e38)
    );

    private static final Pattern PATTERN = Pattern.compile(
            "\\b(" + String.join("|", KEYWORDS.keySet().stream()
                    .sorted(Comparator.comparingInt(String::length).reversed())
                    .toList()) + ")\\b",
            Pattern.CASE_INSENSITIVE);

    private static final Style GRAY = Style.EMPTY.withColor(ChatFormatting.GRAY);

    public static void register() {
        ItemTooltipCallback.EVENT.register((stack, context, flag, lines) -> {
            Identifier id = BuiltInRegistries.ITEM.getKey(stack.getItem());
            if (!id.getNamespace().equals(SlayerSwords.MOD_ID)) return;
            if(!lines.isEmpty()) {
                Component name = lines.get(0);
                lines.set(0, colorize(name.getString(), name.getStyle()));
            }
            String key = "itemTooltip." + id.getNamespace() + "." + id.getPath();
            if (Language.getInstance().has(key)) {
                lines.add(colorize(Language.getInstance().getOrDefault(key), GRAY));
            }
        });
    }

    private static MutableComponent colorize(String text, Style base) {
        MutableComponent result = Component.empty();
        Matcher matcher = PATTERN.matcher(text);
        int last = 0;
        while (matcher.find()) {
            result.append(Component.literal(text.substring(last, matcher.start())).setStyle(base));
            int color = KEYWORDS.get(matcher.group().toLowerCase());
            result.append(Component.literal(matcher.group()).setStyle(base.withColor(color)));
            last = matcher.end();
        }
        result.append(Component.literal(text.substring(last)).setStyle(base));
        return result;
    }
}
