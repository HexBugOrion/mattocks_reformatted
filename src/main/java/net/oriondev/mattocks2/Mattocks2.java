package net.oriondev.mattocks2;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.oriondev.mattocks2.mattock_type.BotchedToolMaterialsPendorite;
import net.oriondev.mattocks2.mattock_type.Mattock;

public class Mattocks2 implements ModInitializer {

	public static final Mattock PENDORITE_MATTOCK = new Mattock(7, -3, new BotchedToolMaterialsPendorite(), new Item.Settings().group(ItemGroup.TOOLS).fireproof());
	public static final Mattock NETHERITE_MATTOCK = new Mattock(6, -3, ToolMaterials.NETHERITE, new Item.Settings().group(ItemGroup.TOOLS).fireproof());
	public static final Mattock DIAMOND_MATTOCK = new Mattock(3, -3, ToolMaterials.DIAMOND, new Item.Settings().group(ItemGroup.TOOLS));
	public static final Mattock IRON_MATTOCK = new Mattock(3, -3, ToolMaterials.IRON, new Item.Settings().group(ItemGroup.TOOLS));
	public static final Mattock STONE_MATTOCK = new Mattock(3, -3, ToolMaterials.STONE, new Item.Settings().group(ItemGroup.TOOLS));
	public static final Mattock WOODEN_MATTOCK = new Mattock(2, -3, ToolMaterials.WOOD, new Item.Settings().group(ItemGroup.TOOLS));
	public static final Mattock GOLDEN_MATTOCK = new Mattock(3, -3, ToolMaterials.GOLD, new Item.Settings().group(ItemGroup.TOOLS));

	@Override
	public void onInitialize() {
		if(FabricLoader.INSTANCE.isModLoaded("byg")) {
			Registry.register(Registry.ITEM, new Identifier("mattocks2", "pendorite_mattock"), PENDORITE_MATTOCK);
		}
		Registry.register(Registry.ITEM, new Identifier("mattocks2", "netherite_mattock"), NETHERITE_MATTOCK);
		Registry.register(Registry.ITEM, new Identifier("mattocks2", "diamond_mattock"), DIAMOND_MATTOCK);
		Registry.register(Registry.ITEM, new Identifier("mattocks2", "iron_mattock"), IRON_MATTOCK);
		Registry.register(Registry.ITEM, new Identifier("mattocks2", "stone_mattock"), STONE_MATTOCK);
		Registry.register(Registry.ITEM, new Identifier("mattocks2", "wooden_mattock"), WOODEN_MATTOCK);
		Registry.register(Registry.ITEM, new Identifier("mattocks2", "golden_mattock"), GOLDEN_MATTOCK);
	}
}
