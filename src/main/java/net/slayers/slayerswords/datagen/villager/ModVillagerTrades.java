package net.slayers.slayerswords.datagen.villager;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.TradeCost;
import net.minecraft.world.item.trading.VillagerTrade;
import net.slayers.slayerswords.SlayerSwords;
import net.slayers.slayerswords.item.ModItems;

import java.util.List;
import java.util.Optional;

public class ModVillagerTrades {
    public static final ResourceKey<VillagerTrade> WEAPONSMITH_5_DIAMOND_BLACK_NICHIRIN = createKey("weaponsmith/5/diamond_black_nichirin");


    public static void bootstrap(BootstrapContext<VillagerTrade> context){


        context.register(WEAPONSMITH_5_DIAMOND_BLACK_NICHIRIN, new VillagerTrade(
                new TradeCost(Items.DIAMOND, 50),
                new ItemStackTemplate(ModItems.BLACK_NICHIRIN),
                5, 20, 0.1f,
                Optional.empty(), List.of()));


    }





    private static final ResourceKey<VillagerTrade> createKey(String name) {
        return ResourceKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, name));
    }
}
