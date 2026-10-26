package net.slayers.slayerswords.menu;

import net.fabricmc.fabric.api.menu.v1.ExtendedMenuType;
import net.slayers.slayerswords.SlayerSwords;
import net.slayers.slayerswords.menu.custom.PedestalMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.inventory.MenuType;

public class ModMenuTypes {
    public static final MenuType<PedestalMenu> PEDESTAL_MENU = Registry.register(BuiltInRegistries.MENU, Identifier.fromNamespaceAndPath(SlayerSwords.MOD_ID, "pedestal_menu"),
            new ExtendedMenuType<>(PedestalMenu::new, BlockPos.STREAM_CODEC)

    );

    public static void registerModMenuTypes() {
        SlayerSwords.LOGGER.info("Registering ModMenuTypes for" + SlayerSwords.MOD_ID);
    }
}
