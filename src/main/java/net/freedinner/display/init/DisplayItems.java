package net.freedinner.display.init;

import net.freedinner.display.Display;
import net.freedinner.display.item.*;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

public class DisplayItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(Registries.ITEM, Display.MODID);
	public static final DeferredHolder<Item, Item> DISPLAY = REGISTRY.register("item_display", () -> new DisplayItem(createBaseProps("item_display")));
	public static final DeferredHolder<Item, Item> WHITE_PILLOW = REGISTRY.register("white_jewelry_pillow", () -> new PillowItem(createBaseProps("white_jewelry_pillow")));
	public static final DeferredHolder<Item, Item> LG_PILLOW = REGISTRY.register("light_gray_jewelry_pillow", () -> new PillowItem(createBaseProps("light_gray_jewelry_pillow")));
	public static final DeferredHolder<Item, Item> GRAY_PILLOW = REGISTRY.register("gray_jewelry_pillow", () -> new PillowItem(createBaseProps("gray_jewelry_pillow")));
	public static final DeferredHolder<Item, Item> BLACK_PILLOW = REGISTRY.register("black_jewelry_pillow", () -> new PillowItem(createBaseProps("black_jewelry_pillow")));
	public static final DeferredHolder<Item, Item> RED_PILLOW = REGISTRY.register("red_jewelry_pillow", () -> new PillowItem(createBaseProps("red_jewelry_pillow")));
	public static final DeferredHolder<Item, Item> ORANGE_PILLOW = REGISTRY.register("orange_jewelry_pillow", () -> new PillowItem(createBaseProps("orange_jewelry_pillow")));
	public static final DeferredHolder<Item, Item> YELLOW_PILLOW = REGISTRY.register("yellow_jewelry_pillow", () -> new PillowItem(createBaseProps("yellow_jewelry_pillow")));
	public static final DeferredHolder<Item, Item> LIME_PILLOW = REGISTRY.register("lime_jewelry_pillow", () -> new PillowItem(createBaseProps("lime_jewelry_pillow")));
	public static final DeferredHolder<Item, Item> GREEN_PILLOW = REGISTRY.register("green_jewelry_pillow", () -> new PillowItem(createBaseProps("green_jewelry_pillow")));
	public static final DeferredHolder<Item, Item> LB_PILLOW = REGISTRY.register("light_blue_jewelry_pillow", () -> new PillowItem(createBaseProps("light_blue_jewelry_pillow")));
	public static final DeferredHolder<Item, Item> CYAN_PILLOW = REGISTRY.register("cyan_jewelry_pillow", () -> new PillowItem(createBaseProps("cyan_jewelry_pillow")));
	public static final DeferredHolder<Item, Item> BLUE_PILLOW = REGISTRY.register("blue_jewelry_pillow", () -> new PillowItem(createBaseProps("blue_jewelry_pillow")));
	public static final DeferredHolder<Item, Item> PURPLE_PILLOW = REGISTRY.register("purple_jewelry_pillow", () -> new PillowItem(createBaseProps("purple_jewelry_pillow")));
	public static final DeferredHolder<Item, Item> MAGE_PILLOW = REGISTRY.register("magenta_jewelry_pillow", () -> new PillowItem(createBaseProps("magenta_jewelry_pillow")));
	public static final DeferredHolder<Item, Item> PINK_PILLOW = REGISTRY.register("pink_jewelry_pillow", () -> new PillowItem(createBaseProps("pink_jewelry_pillow")));
	public static final DeferredHolder<Item, Item> BROWN_PILLOW = REGISTRY.register("brown_jewelry_pillow", () -> new PillowItem(createBaseProps("brown_jewelry_pillow")));
	
	public static final DeferredHolder<Item, Item> ANGLER_POTTERY_SHERD = block(DisplayBlocks.ANGLER_POTTERY_SHERD, "angler_pottery_sherd");
	public static final DeferredHolder<Item, Item> ARCHER_POTTERY_SHERD = block(DisplayBlocks.ARCHER_POTTERY_SHERD, "archer_pottery_sherd");
	public static final DeferredHolder<Item, Item> ARMS_UP_POTTERY_SHERD = block(DisplayBlocks.ARMS_UP_POTTERY_SHERD, "arms_up_pottery_sherd");
	public static final DeferredHolder<Item, Item> BLADE_POTTERY_SHERD = block(DisplayBlocks.BLADE_POTTERY_SHERD, "blade_pottery_sherd");
	public static final DeferredHolder<Item, Item> BREWER_POTTERY_SHERD = block(DisplayBlocks.BREWER_POTTERY_SHERD, "brewer_pottery_sherd");
	public static final DeferredHolder<Item, Item> BURN_POTTERY_SHERD = block(DisplayBlocks.BURN_POTTERY_SHERD, "burn_pottery_sherd");
	public static final DeferredHolder<Item, Item> DANGER_POTTERY_SHERD = block(DisplayBlocks.DANGER_POTTERY_SHERD, "danger_pottery_sherd");
	public static final DeferredHolder<Item, Item> EXPLORER_POTTERY_SHERD = block(DisplayBlocks.EXPLORER_POTTERY_SHERD, "explorer_pottery_sherd");
	public static final DeferredHolder<Item, Item> FLOW_POTTERY_SHERD = block(DisplayBlocks.FLOW_POTTERY_SHERD, "flow_pottery_sherd");
	public static final DeferredHolder<Item, Item> FRIEND_POTTERY_SHERD = block(DisplayBlocks.FRIEND_POTTERY_SHERD, "friend_pottery_sherd");
	public static final DeferredHolder<Item, Item> GUSTER_POTTERY_SHERD = block(DisplayBlocks.GUSTER_POTTERY_SHERD, "guster_pottery_sherd");
	public static final DeferredHolder<Item, Item> HEART_POTTERY_SHERD = block(DisplayBlocks.HEART_POTTERY_SHERD, "heart_pottery_sherd");
	public static final DeferredHolder<Item, Item> HEARTBREAK_POTTERY_SHERD = block(DisplayBlocks.HEARTBREAK_POTTERY_SHERD, "heartbreak_pottery_sherd");
	public static final DeferredHolder<Item, Item> HOWL_POTTERY_SHERD = block(DisplayBlocks.HOWL_POTTERY_SHERD, "howl_pottery_sherd");
	public static final DeferredHolder<Item, Item> MINER_POTTERY_SHERD = block(DisplayBlocks.MINER_POTTERY_SHERD, "miner_pottery_sherd");
	public static final DeferredHolder<Item, Item> MOURNER_POTTERY_SHERD = block(DisplayBlocks.MOURNER_POTTERY_SHERD, "mourner_pottery_sherd");
	public static final DeferredHolder<Item, Item> PLENTY_POTTERY_SHERD = block(DisplayBlocks.PLENTY_POTTERY_SHERD, "plenty_pottery_sherd");
	public static final DeferredHolder<Item, Item> PRIZE_POTTERY_SHERD = block(DisplayBlocks.PRIZE_POTTERY_SHERD, "prize_pottery_sherd");
	public static final DeferredHolder<Item, Item> SCRAPE_POTTERY_SHERD = block(DisplayBlocks.SCRAPE_POTTERY_SHERD, "scrape_pottery_sherd");
	public static final DeferredHolder<Item, Item> SHEAF_POTTERY_SHERD = block(DisplayBlocks.SHEAF_POTTERY_SHERD, "sheaf_pottery_sherd");
	public static final DeferredHolder<Item, Item> SHELTER_POTTERY_SHERD = block(DisplayBlocks.SHELTER_POTTERY_SHERD, "shelter_pottery_sherd");
	public static final DeferredHolder<Item, Item> SKULL_POTTERY_SHERD = block(DisplayBlocks.SKULL_POTTERY_SHERD, "skull_pottery_sherd");
	public static final DeferredHolder<Item, Item> SNORT_POTTERY_SHERD = block(DisplayBlocks.SNORT_POTTERY_SHERD, "snort_pottery_sherd");
	public static final DeferredHolder<Item, Item> DINOSAUR_POTTERY_SHERD = block(DisplayBlocks.DINOSAUR_POTTERY_SHERD, "dinosaur_pottery_sherd");
	public static final DeferredHolder<Item, Item> FOOTPRINT_POTTERY_SHERD = block(DisplayBlocks.FOOTPRINT_POTTERY_SHERD, "footprint_pottery_sherd");
	public static final DeferredHolder<Item, Item> GUARDIAN_POTTERY_SHERD = block(DisplayBlocks.GUARDIAN_POTTERY_SHERD, "guardian_pottery_sherd");
	public static final DeferredHolder<Item, Item> HERO_POTTERY_SHERD = block(DisplayBlocks.HERO_POTTERY_SHERD, "hero_pottery_sherd");
	public static final DeferredHolder<Item, Item> CROWN_POTTERY_SHERD = block(DisplayBlocks.CROWN_POTTERY_SHERD, "crown_pottery_sherd");
	public static final DeferredHolder<Item, Item> SPADE_POTTERY_SHERD = block(DisplayBlocks.SPADE_POTTERY_SHERD, "spade_pottery_sherd");

	public static final DeferredHolder<Item, Item> NETHERITE_UPGRADE = block(DisplayBlocks.NETHERITE_UPGRADE, "netherite_upgrade");
	public static final DeferredHolder<Item, Item> GOTHIC_UPGRADE = block(DisplayBlocks.GOTHIC_UPGRADE, "gothic_upgrade");
	public static final DeferredHolder<Item, Item> PRESERVED_UPGRADE = block(DisplayBlocks.PRESERVED_UPGRADE, "preserved_upgrade");
	public static final DeferredHolder<Item, Item> SILVER_UPGRADE = block(DisplayBlocks.SILVER_UPGRADE, "silver_upgrade");
	
	public static final DeferredHolder<Item, Item> BOLT_ARMOR_TRIM = block(DisplayBlocks.BOLT_ARMOR_TRIM, "bolt_armor_trim");
	public static final DeferredHolder<Item, Item> COAST_ARMOR_TRIM = block(DisplayBlocks.COAST_ARMOR_TRIM, "coast_armor_trim");
	public static final DeferredHolder<Item, Item> DUNE_ARMOR_TRIM = block(DisplayBlocks.DUNE_ARMOR_TRIM, "dune_armor_trim");
	public static final DeferredHolder<Item, Item> EYE_ARMOR_TRIM = block(DisplayBlocks.EYE_ARMOR_TRIM, "eye_armor_trim");
	public static final DeferredHolder<Item, Item> FLOW_ARMOR_TRIM = block(DisplayBlocks.FLOW_ARMOR_TRIM, "flow_armor_trim");
	public static final DeferredHolder<Item, Item> HOST_ARMOR_TRIM = block(DisplayBlocks.HOST_ARMOR_TRIM, "host_armor_trim");
	public static final DeferredHolder<Item, Item> RAISER_ARMOR_TRIM = block(DisplayBlocks.RAISER_ARMOR_TRIM, "raiser_armor_trim");
	public static final DeferredHolder<Item, Item> RIB_ARMOR_TRIM = block(DisplayBlocks.RIB_ARMOR_TRIM, "rib_armor_trim");
	public static final DeferredHolder<Item, Item> SENTRY_ARMOR_TRIM = block(DisplayBlocks.SENTRY_ARMOR_TRIM, "sentry_armor_trim");
	public static final DeferredHolder<Item, Item> SHAPER_ARMOR_TRIM = block(DisplayBlocks.SHAPER_ARMOR_TRIM, "shaper_armor_trim");
	public static final DeferredHolder<Item, Item> SILENCE_ARMOR_TRIM = block(DisplayBlocks.SILENCE_ARMOR_TRIM, "silence_armor_trim");
	public static final DeferredHolder<Item, Item> SNOUT_ARMOR_TRIM = block(DisplayBlocks.SNOUT_ARMOR_TRIM, "snout_armor_trim");
	public static final DeferredHolder<Item, Item> SPIRE_ARMOR_TRIM = block(DisplayBlocks.SPIRE_ARMOR_TRIM, "spire_armor_trim");
	public static final DeferredHolder<Item, Item> TIDE_ARMOR_TRIM = block(DisplayBlocks.TIDE_ARMOR_TRIM, "tide_armor_trim");
	public static final DeferredHolder<Item, Item> VEX_ARMOR_TRIM = block(DisplayBlocks.VEX_ARMOR_TRIM, "vex_armor_trim");
	public static final DeferredHolder<Item, Item> WARD_ARMOR_TRIM = block(DisplayBlocks.WARD_ARMOR_TRIM, "ward_armor_trim");
	public static final DeferredHolder<Item, Item> WAYFINDER_ARMOR_TRIM = block(DisplayBlocks.WAYFINDER_ARMOR_TRIM, "wayfinder_armor_trim");
	public static final DeferredHolder<Item, Item> WILD_ARMOR_TRIM = block(DisplayBlocks.WILD_ARMOR_TRIM, "wild_armor_trim");
	public static final DeferredHolder<Item, Item> KOBOLD_ARMOR_TRIM = block(DisplayBlocks.KOBOLD_ARMOR_TRIM, "kobold_armor_trim");
	public static final DeferredHolder<Item, Item> NECRO_ARMOR_TRIM = block(DisplayBlocks.NECRO_ARMOR_TRIM, "necro_armor_trim");
	public static final DeferredHolder<Item, Item> POLAR_ARMOR_TRIM = block(DisplayBlocks.POLAR_ARMOR_TRIM, "polar_armor_trim");

	public static final DeferredHolder<Item, Item> BRICK = block(DisplayBlocks.BRICK, "brick");
	public static final DeferredHolder<Item, Item> NETHER_BRICK = block(DisplayBlocks.NETHER_BRICK, "nether_brick");
	public static final DeferredHolder<Item, Item> ASH_BRICK = block(DisplayBlocks.ASH_BRICK, "ash_brick");
	public static final DeferredHolder<Item, Item> IRON_INGOT = block(DisplayBlocks.IRON_INGOT, "iron_ingot");
	public static final DeferredHolder<Item, Item> COPPER_INGOT = block(DisplayBlocks.COPPER_INGOT, "copper_ingot");
	public static final DeferredHolder<Item, Item> GOLD_INGOT = block(DisplayBlocks.GOLD_INGOT, "gold_ingot");
	public static final DeferredHolder<Item, Item> NETHERITE_INGOT = block(DisplayBlocks.NETHERITE_INGOT, "netherite_ingot");
	public static final DeferredHolder<Item, Item> AZURE_INGOT = block(DisplayBlocks.AZURE_INGOT, "azure_ingot");
	public static final DeferredHolder<Item, Item> SCARLET_INGOT = block(DisplayBlocks.SCARLET_INGOT, "scarlet_ingot");
	public static final DeferredHolder<Item, Item> BRASS_INGOT = block(DisplayBlocks.BRASS_INGOT, "brass_ingot");
	public static final DeferredHolder<Item, Item> ZINC_INGOT = block(DisplayBlocks.ZINC_INGOT, "zinc_ingot");
	public static final DeferredHolder<Item, Item> SILVER_INGOT = block(DisplayBlocks.SILVER_INGOT, "silver_ingot");

	public static final DeferredHolder<Item, Item> FRAGMENTS = block(DisplayBlocks.FRAGMENTS, "disc_fragment_5");
	public static final DeferredHolder<Item, Item> FUSIONS = block(DisplayBlocks.FUSIONS, "disc_fragment_fusion");
	public static final DeferredHolder<Item, Item> TASTYS = block(DisplayBlocks.TASTYS, "disc_fragment_tasty");
	public static final DeferredHolder<Item, Item> COAL = block(DisplayBlocks.COAL, "coal");
	public static final DeferredHolder<Item, Item> CHARCOAL = block(DisplayBlocks.CHARCOAL, "charcoal");
	public static final DeferredHolder<Item, Item> AMETHYST = block(DisplayBlocks.AMETHYST, "amethyst_shard");
	public static final DeferredHolder<Item, Item> DIAMOND = block(DisplayBlocks.DIAMOND, "diamond");
	public static final DeferredHolder<Item, Item> EMERALD = block(DisplayBlocks.EMERALD, "emerald");
	public static final DeferredHolder<Item, Item> LAPIS = block(DisplayBlocks.LAPIS, "lapis_lazuli");
	public static final DeferredHolder<Item, Item> ECHO = block(DisplayBlocks.ECHO, "echo_shard");
	public static final DeferredHolder<Item, Item> ALLURITE = block(DisplayBlocks.ALLURITE, "allurite_shard");
	public static final DeferredHolder<Item, Item> LUMIERE = block(DisplayBlocks.LUMIERE, "lumiere_shard");

	public static final DeferredHolder<Item, Item> MUSIC_FIVE = block(DisplayBlocks.MUSIC_FIVE, "music_disc_5");
	public static final DeferredHolder<Item, Item> MUSIC_ELE = block(DisplayBlocks.MUSIC_ELE, "music_disc_11");
	public static final DeferredHolder<Item, Item> MUSIC_THREE = block(DisplayBlocks.MUSIC_THREE, "music_disc_13");
	public static final DeferredHolder<Item, Item> MUSIC_BLOCKS = block(DisplayBlocks.MUSIC_BLOCKS, "music_disc_blocks");
	public static final DeferredHolder<Item, Item> MUSIC_CAT = block(DisplayBlocks.MUSIC_CAT, "music_disc_cat");
	public static final DeferredHolder<Item, Item> MUSIC_CHIRP = block(DisplayBlocks.MUSIC_CHIRP, "music_disc_chirp");
	public static final DeferredHolder<Item, Item> MUSIC_CREATOR = block(DisplayBlocks.MUSIC_CREATOR, "music_disc_creator");
	public static final DeferredHolder<Item, Item> MUSIC_CREATOR_BOX = block(DisplayBlocks.MUSIC_CREATOR_BOX, "music_disc_creator_music_box");
	public static final DeferredHolder<Item, Item> MUSIC_FAR = block(DisplayBlocks.MUSIC_FAR, "music_disc_far");
	public static final DeferredHolder<Item, Item> MUSIC_MALL = block(DisplayBlocks.MUSIC_MALL, "music_disc_mall");
	public static final DeferredHolder<Item, Item> MUSIC_MELLO = block(DisplayBlocks.MUSIC_MELLO, "music_disc_mellohi");
	public static final DeferredHolder<Item, Item> MUSIC_OTHERSIDE = block(DisplayBlocks.MUSIC_OTHERSIDE, "music_disc_otherside");
	public static final DeferredHolder<Item, Item> MUSIC_PIG = block(DisplayBlocks.MUSIC_PIG, "music_disc_pigstep");
	public static final DeferredHolder<Item, Item> MUSIC_PRECIPICE = block(DisplayBlocks.MUSIC_PRECIPICE, "music_disc_precipice");
	public static final DeferredHolder<Item, Item> MUSIC_RELIC = block(DisplayBlocks.MUSIC_RELIC, "music_disc_relic");
	public static final DeferredHolder<Item, Item> MUSIC_STAL = block(DisplayBlocks.MUSIC_STAL, "music_disc_stal");
	public static final DeferredHolder<Item, Item> MUSIC_SRAD = block(DisplayBlocks.MUSIC_SRAD, "music_disc_strad");
	public static final DeferredHolder<Item, Item> MUSIC_WAIT = block(DisplayBlocks.MUSIC_WAIT, "music_disc_wait");
	public static final DeferredHolder<Item, Item> MUSIC_WARD = block(DisplayBlocks.MUSIC_WARD, "music_disc_ward");
	public static final DeferredHolder<Item, Item> MUSIC_FUSION = block(DisplayBlocks.MUSIC_FUSION, "music_disc_fusion");
	public static final DeferredHolder<Item, Item> MUSIC_TASTY = block(DisplayBlocks.MUSIC_TASTY, "music_disc_tasty");
	public static final DeferredHolder<Item, Item> MUSIC_DRIFT = block(DisplayBlocks.MUSIC_DRIFT, "music_disc_drift");
	public static final DeferredHolder<Item, Item> MUSIC_COCO = block(DisplayBlocks.MUSIC_COCO, "music_disc_coconut");
	public static final DeferredHolder<Item, Item> MUSIC_KOBOLD = block(DisplayBlocks.MUSIC_KOBOLD, "music_disc_kobblestone");
	public static final DeferredHolder<Item, Item> MUSIC_ROT = block(DisplayBlocks.MUSIC_ROT, "music_disc_rot");

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block, String name) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), createBaseProps(name)));
	}

	public static Item.Properties createBaseProps(String name) {
		return new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Display.MODID, name)));
	}
}