package net.freedinner.display.init;

import net.freedinner.display.Display;
import net.freedinner.display.block.*;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

public class DisplayBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(Registries.BLOCK, Display.MODID);
	public static final DeferredHolder<Block, Block> ANGLER_POTTERY_SHERD = REGISTRY.register("angler_pottery_sherd", () -> new SherdBlock(createBlock("angler_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> ARCHER_POTTERY_SHERD = REGISTRY.register("archer_pottery_sherd", () -> new SherdBlock(createBlock("archer_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> ARMS_UP_POTTERY_SHERD = REGISTRY.register("arms_up_pottery_sherd", () -> new SherdBlock(createBlock("arms_up_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> BLADE_POTTERY_SHERD = REGISTRY.register("blade_pottery_sherd", () -> new SherdBlock(createBlock("blade_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> BREWER_POTTERY_SHERD = REGISTRY.register("brewer_pottery_sherd", () -> new SherdBlock(createBlock("brewer_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> BURN_POTTERY_SHERD = REGISTRY.register("burn_pottery_sherd", () -> new SherdBlock(createBlock("burn_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> DANGER_POTTERY_SHERD = REGISTRY.register("danger_pottery_sherd", () -> new SherdBlock(createBlock("danger_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> EXPLORER_POTTERY_SHERD = REGISTRY.register("explorer_pottery_sherd", () -> new SherdBlock(createBlock("explorer_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> FLOW_POTTERY_SHERD = REGISTRY.register("flow_pottery_sherd", () -> new SherdBlock(createBlock("flow_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> FRIEND_POTTERY_SHERD = REGISTRY.register("friend_pottery_sherd", () -> new SherdBlock(createBlock("friend_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> GUSTER_POTTERY_SHERD = REGISTRY.register("guster_pottery_sherd", () -> new SherdBlock(createBlock("guster_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> HEART_POTTERY_SHERD = REGISTRY.register("heart_pottery_sherd", () -> new SherdBlock(createBlock("heart_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> HEARTBREAK_POTTERY_SHERD = REGISTRY.register("heartbreak_pottery_sherd", () -> new SherdBlock(createBlock("heartbreak_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> HOWL_POTTERY_SHERD = REGISTRY.register("howl_pottery_sherd", () -> new SherdBlock(createBlock("howl_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> MINER_POTTERY_SHERD = REGISTRY.register("miner_pottery_sherd", () -> new SherdBlock(createBlock("miner_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> MOURNER_POTTERY_SHERD = REGISTRY.register("mourner_pottery_sherd", () -> new SherdBlock(createBlock("mourner_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> PLENTY_POTTERY_SHERD = REGISTRY.register("plenty_pottery_sherd", () -> new SherdBlock(createBlock("plenty_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> PRIZE_POTTERY_SHERD = REGISTRY.register("prize_pottery_sherd", () -> new SherdBlock(createBlock("prize_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> SCRAPE_POTTERY_SHERD = REGISTRY.register("scrape_pottery_sherd", () -> new SherdBlock(createBlock("scrape_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> SHEAF_POTTERY_SHERD = REGISTRY.register("sheaf_pottery_sherd", () -> new SherdBlock(createBlock("sheaf_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> SHELTER_POTTERY_SHERD = REGISTRY.register("shelter_pottery_sherd", () -> new SherdBlock(createBlock("shelter_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> SKULL_POTTERY_SHERD = REGISTRY.register("skull_pottery_sherd", () -> new SherdBlock(createBlock("skull_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> SNORT_POTTERY_SHERD = REGISTRY.register("snort_pottery_sherd", () -> new SherdBlock(createBlock("snort_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> DINOSAUR_POTTERY_SHERD = REGISTRY.register("dinosaur_pottery_sherd", () -> new SherdBlock(createBlock("dinosaur_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> FOOTPRINT_POTTERY_SHERD = REGISTRY.register("footprint_pottery_sherd", () -> new SherdBlock(createBlock("footprint_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> GUARDIAN_POTTERY_SHERD = REGISTRY.register("guardian_pottery_sherd", () -> new SherdBlock(createBlock("guardian_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> HERO_POTTERY_SHERD = REGISTRY.register("hero_pottery_sherd", () -> new SherdBlock(createBlock("hero_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> CROWN_POTTERY_SHERD = REGISTRY.register("crown_pottery_sherd", () -> new SherdBlock(createBlock("crown_pottery_sherd", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> SPADE_POTTERY_SHERD = REGISTRY.register("spade_pottery_sherd", () -> new SherdBlock(createBlock("spade_pottery_sherd", SoundType.DECORATED_POT)));
	
	public static final DeferredHolder<Block, Block> NETHERITE_UPGRADE = REGISTRY.register("netherite_upgrade", () -> new UpgradeBlock(createBlock("netherite_upgrade", SoundType.NETHERRACK)));
	public static final DeferredHolder<Block, Block> GOTHIC_UPGRADE = REGISTRY.register("gothic_upgrade", () -> new UpgradeBlock(createBlock("gothic_upgrade", SoundType.SOUL_SOIL)));
	public static final DeferredHolder<Block, Block> PRESERVED_UPGRADE = REGISTRY.register("preserved_upgrade", () -> new UpgradeBlock(createBlock("preserved_upgrade", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> SILVER_UPGRADE = REGISTRY.register("silver_upgrade", () -> new UpgradeBlock(createBlock("silver_upgrade", SoundType.WOOD)));

	public static final DeferredHolder<Block, Block> BOLT_ARMOR_TRIM = REGISTRY.register("bolt_armor_trim", () -> new ArmorTrimBlock(createBlock("bolt_armor_trim", SoundType.COPPER)));
	public static final DeferredHolder<Block, Block> COAST_ARMOR_TRIM = REGISTRY.register("coast_armor_trim", () -> new ArmorTrimBlock(createBlock("coast_armor_trim", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> DUNE_ARMOR_TRIM = REGISTRY.register("dune_armor_trim", () -> new ArmorTrimBlock(createBlock("dune_armor_trim", SoundType.DRIPSTONE_BLOCK)));
	public static final DeferredHolder<Block, Block> EYE_ARMOR_TRIM = REGISTRY.register("eye_armor_trim", () -> new ArmorTrimBlock(createBlock("eye_armor_trim", SoundType.CALCITE)));
	public static final DeferredHolder<Block, Block> FLOW_ARMOR_TRIM = REGISTRY.register("flow_armor_trim", () -> new ArmorTrimBlock(createBlock("flow_armor_trim", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> HOST_ARMOR_TRIM = REGISTRY.register("host_armor_trim", () -> new ArmorTrimBlock(createBlock("host_armor_trim", SoundType.GRAVEL)));
	public static final DeferredHolder<Block, Block> RAISER_ARMOR_TRIM = REGISTRY.register("raiser_armor_trim", () -> new ArmorTrimBlock(createBlock("raiser_armor_trim", SoundType.GRAVEL)));
	public static final DeferredHolder<Block, Block> RIB_ARMOR_TRIM = REGISTRY.register("rib_armor_trim", () -> new ArmorTrimBlock(createBlock("rib_armor_trim", SoundType.NETHER_BRICKS)));
	public static final DeferredHolder<Block, Block> SENTRY_ARMOR_TRIM = REGISTRY.register("sentry_armor_trim", () -> new ArmorTrimBlock(createBlock("sentry_armor_trim", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> SHAPER_ARMOR_TRIM = REGISTRY.register("shaper_armor_trim", () -> new ArmorTrimBlock(createBlock("shaper_armor_trim", SoundType.GRAVEL)));
	public static final DeferredHolder<Block, Block> SILENCE_ARMOR_TRIM = REGISTRY.register("silence_armor_trim", () -> new ArmorTrimBlock(createBlock("silence_armor_trim", SoundType.DEEPSLATE)));
	public static final DeferredHolder<Block, Block> SNOUT_ARMOR_TRIM = REGISTRY.register("snout_armor_trim", () -> new ArmorTrimBlock(createBlock("snout_armor_trim", SoundType.POLISHED_DEEPSLATE)));
	public static final DeferredHolder<Block, Block> SPIRE_ARMOR_TRIM = REGISTRY.register("spire_armor_trim", () -> new ArmorTrimBlock(createBlock("spire_armor_trim", SoundType.DEEPSLATE_BRICKS)));
	public static final DeferredHolder<Block, Block> TIDE_ARMOR_TRIM = REGISTRY.register("tide_armor_trim", () -> new ArmorTrimBlock(createBlock("tide_armor_trim", SoundType.DEEPSLATE_BRICKS)));
	public static final DeferredHolder<Block, Block> VEX_ARMOR_TRIM = REGISTRY.register("vex_armor_trim", () -> new ArmorTrimBlock(createBlock("vex_armor_trim", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> WARD_ARMOR_TRIM = REGISTRY.register("ward_armor_trim", () -> new ArmorTrimBlock(createBlock("ward_armor_trim", SoundType.DEEPSLATE)));
	public static final DeferredHolder<Block, Block> WAYFINDER_ARMOR_TRIM = REGISTRY.register("wayfinder_armor_trim", () -> new ArmorTrimBlock(createBlock("wayfinder_armor_trim", SoundType.GRAVEL)));
	public static final DeferredHolder<Block, Block> WILD_ARMOR_TRIM = REGISTRY.register("wild_armor_trim", () -> new ArmorTrimBlock(createBlock("wild_armor_trim", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> KOBOLD_ARMOR_TRIM = REGISTRY.register("kobold_armor_trim", () -> new ArmorTrimBlock(createBlock("kobold_armor_trim", SoundType.TUFF)));
	public static final DeferredHolder<Block, Block> NECRO_ARMOR_TRIM = REGISTRY.register("necro_armor_trim", () -> new ArmorTrimBlock(createBlock("necro_armor_trim", SoundType.SOUL_SOIL)));
	public static final DeferredHolder<Block, Block> POLAR_ARMOR_TRIM = REGISTRY.register("polarity_armor_trim", () -> new ArmorTrimBlock(createBlock("polarity_armor_trim", SoundType.STONE)));

	public static final DeferredHolder<Block, Block> BRICK = REGISTRY.register("brick", () -> new IngotBlock(createBlock("brick", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> NETHER_BRICK = REGISTRY.register("nether_brick", () -> new IngotBlock(createBlock("nether_brick", SoundType.NETHER_BRICKS)));
	public static final DeferredHolder<Block, Block> ASH_BRICK = REGISTRY.register("ash_brick", () -> new IngotBlock(createBlock("ash_brick", SoundType.DECORATED_POT)));
	public static final DeferredHolder<Block, Block> IRON_INGOT = REGISTRY.register("iron_ingot", () -> new IngotBlock(createBlock("iron_ingot", SoundType.METAL)));
	public static final DeferredHolder<Block, Block> COPPER_INGOT = REGISTRY.register("copper_ingot", () -> new IngotBlock(createBlock("copper_ingot", SoundType.COPPER)));
	public static final DeferredHolder<Block, Block> GOLD_INGOT = REGISTRY.register("gold_ingot", () -> new IngotBlock(createBlock("gold_ingot", SoundType.METAL)));
	public static final DeferredHolder<Block, Block> NETHERITE_INGOT = REGISTRY.register("netherite_ingot", () -> new IngotBlock(createBlock("netherite_ingot", SoundType.NETHERITE_BLOCK)));
	public static final DeferredHolder<Block, Block> AZURE_INGOT = REGISTRY.register("azure_ingot", () -> new IngotBlock(createBlock("azure_ingot", SoundType.METAL)));
	public static final DeferredHolder<Block, Block> SCARLET_INGOT = REGISTRY.register("scarlet_ingot", () -> new IngotBlock(createBlock("scarlet_ingot", SoundType.METAL)));
	public static final DeferredHolder<Block, Block> BRASS_INGOT = REGISTRY.register("brass_ingot", () -> new IngotBlock(createBlock("brass_ingot", SoundType.METAL)));
	public static final DeferredHolder<Block, Block> ZINC_INGOT = REGISTRY.register("zinc_ingot", () -> new IngotBlock(createBlock("zinc_ingot", SoundType.METAL)));
	public static final DeferredHolder<Block, Block> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new IngotBlock(createBlock("silver_ingot", SoundType.METAL)));

	public static final DeferredHolder<Block, Block> FRAGMENTS = REGISTRY.register("disc_fragment_5", () -> new FragmentsBlock(createBlock("disc_fragment_5", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> FUSIONS = REGISTRY.register("disc_fragment_fusion", () -> new FragmentsBlock(createBlock("disc_fragment_fusion", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> TASTYS = REGISTRY.register("disc_fragment_tasty", () -> new FragmentsBlock(createBlock("disc_fragment_tasty", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> COAL = REGISTRY.register("coal", () -> new GemBlock(createBlock("coal", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> CHARCOAL = REGISTRY.register("charcoal", () -> new GemBlock(createBlock("charcoal", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> AMETHYST = REGISTRY.register("amethyst_shard", () -> new GemBlock(createBlock("amethyst_shard", SoundType.AMETHYST)));
	public static final DeferredHolder<Block, Block> DIAMOND = REGISTRY.register("diamond", () -> new GemBlock(createBlock("diamond", SoundType.METAL)));
	public static final DeferredHolder<Block, Block> EMERALD = REGISTRY.register("emerald", () -> new GemBlock(createBlock("emerald", SoundType.METAL)));
	public static final DeferredHolder<Block, Block> LAPIS = REGISTRY.register("lapis_lazuli", () -> new GemBlock(createBlock("lapis_lazuli", SoundType.METAL)));
	public static final DeferredHolder<Block, Block> ECHO = REGISTRY.register("echo_shard", () -> new GemBlock(createBlock("echo_shard", SoundType.AMETHYST)));
	public static final DeferredHolder<Block, Block> ALLURITE = REGISTRY.register("allurite_shard", () -> new GemBlock(createBlock("allurite_shard", SoundType.AMETHYST)));
	public static final DeferredHolder<Block, Block> LUMIERE = REGISTRY.register("lumiere_shard", () -> new GemBlock(createBlock("lumiere_shard", SoundType.AMETHYST)));

	public static final DeferredHolder<Block, Block> MUSIC_FIVE = REGISTRY.register("music_disc_5", () -> new MusicBlock(createBlock("music_disc_5", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_ELE = REGISTRY.register("music_disc_11", () -> new MusicBlock(createBlock("music_disc_11", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_THREE = REGISTRY.register("music_disc_13", () -> new MusicBlock(createBlock("music_disc_13", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_BLOCKS = REGISTRY.register("music_disc_blocks", () -> new MusicBlock(createBlock("music_disc_blocks", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_CAT = REGISTRY.register("music_disc_cat", () -> new MusicBlock(createBlock("music_disc_cat", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_CHIRP = REGISTRY.register("music_disc_chirp", () -> new MusicBlock(createBlock("music_disc_chirp", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_CREATOR = REGISTRY.register("music_disc_creator", () -> new MusicBlock(createBlock("music_disc_creator", SoundType.COPPER)));
	public static final DeferredHolder<Block, Block> MUSIC_CREATOR_BOX = REGISTRY.register("music_disc_creator_music_box", () -> new MusicBlock(createBlock("music_disc_creator_music_box", SoundType.COPPER)));
	public static final DeferredHolder<Block, Block> MUSIC_FAR = REGISTRY.register("music_disc_far", () -> new MusicBlock(createBlock("music_disc_far", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_MALL = REGISTRY.register("music_disc_mall", () -> new MusicBlock(createBlock("music_disc_mall", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_MELLO = REGISTRY.register("music_disc_mellohi", () -> new MusicBlock(createBlock("music_disc_mellohi", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_OTHERSIDE = REGISTRY.register("music_disc_otherside", () -> new MusicBlock(createBlock("music_disc_otherside", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_PIG = REGISTRY.register("music_disc_pigstep", () -> new MusicBlock(createBlock("music_disc_pigstep", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_PRECIPICE = REGISTRY.register("music_disc_precipice", () -> new MusicBlock(createBlock("music_disc_precipice", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_RELIC = REGISTRY.register("music_disc_relic", () -> new MusicBlock(createBlock("music_disc_relic", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_STAL = REGISTRY.register("music_disc_stal", () -> new MusicBlock(createBlock("music_disc_stal", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_SRAD = REGISTRY.register("music_disc_strad", () -> new MusicBlock(createBlock("music_disc_strad", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_WAIT = REGISTRY.register("music_disc_wait", () -> new MusicBlock(createBlock("music_disc_wait", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_WARD = REGISTRY.register("music_disc_ward", () -> new MusicBlock(createBlock("music_disc_ward", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_FUSION = REGISTRY.register("music_disc_fusion", () -> new MusicBlock(createBlock("music_disc_fusion", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_TASTY = REGISTRY.register("music_disc_tasty", () -> new MusicBlock(createBlock("music_disc_tasty", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_DRIFT = REGISTRY.register("music_disc_drift", () -> new MusicBlock(createBlock("music_disc_drift", SoundType.WOOL)));
	public static final DeferredHolder<Block, Block> MUSIC_COCO = REGISTRY.register("music_disc_coconut", () -> new MusicBlock(createBlock("music_disc_coconut", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_KOBOLD = REGISTRY.register("music_disc_kobblestone", () -> new MusicBlock(createBlock("music_disc_kobblestone", SoundType.STONE)));
	public static final DeferredHolder<Block, Block> MUSIC_ROT = REGISTRY.register("music_disc_rot", () -> new MusicBlock(createBlock("music_disc_rot", SoundType.STONE)));

	private static BlockBehaviour.Properties createBlock(String name, SoundType sound) {
		return createBaseProps(name).mapColor(MapColor.NONE).sound(sound);
	}

	private static BlockBehaviour.Properties createBaseProps(String name) {
		return BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Display.MODID, name))).noTerrainParticles().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY);
	}
}