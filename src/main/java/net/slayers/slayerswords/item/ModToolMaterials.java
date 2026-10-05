package net.slayers.slayerswords.item;

import net.slayers.slayerswords.tags.ModTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolMaterials {
    public static final ToolMaterial DEMON = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_DEMON_TOOL,
            3000, 12, 6, 30, ModTags.Items.DEMON_REPAIR);

    public static final ToolMaterial BASIC = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_BASIC_TOOL,
            2500, 10, 5, 10, ModTags.Items.BASIC_REPAIR);
}
