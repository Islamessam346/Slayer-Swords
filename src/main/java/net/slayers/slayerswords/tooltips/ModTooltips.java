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
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ModTooltips {
    private static final Map<String, Integer> KEYWORDS = new HashMap<>();

    static {
        add(0xffff00, "lightning", "yellow");
        add(0xffff55, "thunder");
        add(0xff0000, "revenge", "red");
        add(0xffffff, "serpent", "white");
        add(0xdd44dd, "flower");
        add(0x0981d1, "marine");
        add(0xe54141, "sound");
        add(0xe25822, "flame");
        add(0xd1f1f9, "beast");
        add(0x806043, "stone");
        add(0x0000ff, "water", "blue");
        add(0x800080, "toxic");
        add(0x7a0006, "demon");
        add(0x333333, "black");
        add(0xcadb63, "wind");
        add(0xcdd8d9, "mist");
        add(0xe48ca3, "love");
        add(0xef8e38, "sun");
    }

    private static void add(int color, String... words) {
        for (String word : words) {
            KEYWORDS.put(word.toLowerCase(), color);
        }
    }

    private static final Pattern PATTERN = Pattern.compile(
            "\\b(" + KEYWORDS.keySet().stream()
                    .sorted(Comparator.comparingInt(String::length).reversed())
                    .map(Pattern::quote).collect(Collectors.joining("|")) + ")\\b",
            Pattern.CASE_INSENSITIVE);

    private static final Style GRAY = Style.EMPTY.withColor(ChatFormatting.GRAY);

    public static void registerModTooltips() {
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
