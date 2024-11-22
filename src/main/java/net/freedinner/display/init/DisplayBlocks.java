package net.freedinner.display.init;

import net.freedinner.display.Display;
import net.freedinner.display.block.*;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import java.util.HashMap;
import java.util.Map;

public class DisplayBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(Registries.BLOCK, Display.MODID);

	public static void setupBlocks() {
		for (Item target : BuiltInRegistries.ITEM) {
			String id = BuiltInRegistries.ITEM.getKey(target).getPath();
			if (id.contains("sherd")) {
				REGISTRY.register(id, () -> new SherdBlock(createBlock(id, SoundType.DECORATED_POT)));
			} else if (id.contains("upgrade_smithing_template") || isSupportedUpgrade(id)) {
				REGISTRY.register(id, () -> new UpgradeBlock(createBlock(id, getUpgradeSound(target))));
			} else if (id.contains("armor_trim_smithing_template") || isSupportedArmorTrim(id)) {
				REGISTRY.register(id, () -> new ArmorTrimBlock(createBlock(id, getArmorTrimSound(target))));
			} else if (id.contains("disc_fragment")) {
				REGISTRY.register(id, () -> new FragmentsBlock(createBlock(id, SoundType.STONE)));
			} else if (id.contains("music_disc")) {
				REGISTRY.register(id, () -> new MusicBlock(createBlock(id, getMusicDiscSound(target))));
			} else if (id.contains("ingot") || id.contains("brick")) {
				REGISTRY.register(id, () -> new IngotBlock(createBlock(id, getIngotSound(target, id))));
			} else if (isSupportedGem(id)) {
				REGISTRY.register(id, () -> new GemBlock(createBlock(id, getGemSound(id))));
			}
		}
	}

	private static BlockBehaviour.Properties createBlock(String name, SoundType sound) {
		return createBaseProps(name).mapColor(MapColor.NONE).sound(sound);
	}

	private static BlockBehaviour.Properties createBaseProps(String name) {
		return BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Display.MODID, name))).noTerrainParticles().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY);
	}

	private static boolean isSupportedUpgrade(String id) {
		Map<String, Boolean> checkMap = new HashMap<>();
		checkMap.put("gothic_template", true);
		checkMap.put("preserved_template", true);
		return checkMap.getOrDefault(id, false);
	}

	private static boolean isSupportedArmorTrim(String id) {
		Map<String, Boolean> checkMap = new HashMap<>();
		checkMap.put("necro_template", true);
		checkMap.put("kobold_template", true);
		return checkMap.getOrDefault(id, false);
	}

	private static boolean isSupportedGem(String id) {
		Map<String, Boolean> checkMap = new HashMap<>();
		checkMap.put("coal", true);
		checkMap.put("charcoal", true);
		checkMap.put("amethyst_shard", true);
		checkMap.put("diamond", true);
		checkMap.put("emerald", true);
		checkMap.put("lapis_lazuli", true);
		checkMap.put("echo_shard", true);
		checkMap.put("allurite_shard", true);
		checkMap.put("lumiere_shard", true);
		return checkMap.getOrDefault(id, false);
	}

	private static SoundType getUpgradeSound(Item target) {
		Map<Item, SoundType> soundMap = new HashMap<>();
		soundMap.put(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, SoundType.NETHERRACK);
		return soundMap.getOrDefault(target, SoundType.STONE);
	}

	private static SoundType getArmorTrimSound(Item target) {
		Map<Item, SoundType> soundMap = new HashMap<>();
		soundMap.put(Items.BOLT_ARMOR_TRIM_SMITHING_TEMPLATE, SoundType.COPPER);
		soundMap.put(Items.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE, SoundType.DRIPSTONE_BLOCK);
		soundMap.put(Items.EYE_ARMOR_TRIM_SMITHING_TEMPLATE, SoundType.CALCITE);
		soundMap.put(Items.HOST_ARMOR_TRIM_SMITHING_TEMPLATE, SoundType.GRAVEL);
		soundMap.put(Items.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE, SoundType.GRAVEL);
		soundMap.put(Items.RIB_ARMOR_TRIM_SMITHING_TEMPLATE, SoundType.NETHER_BRICKS);
		soundMap.put(Items.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE, SoundType.GRAVEL);
		soundMap.put(Items.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE, SoundType.DEEPSLATE);
		soundMap.put(Items.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE, SoundType.POLISHED_DEEPSLATE);
		soundMap.put(Items.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE, SoundType.DEEPSLATE_BRICKS);
		soundMap.put(Items.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE, SoundType.DEEPSLATE_BRICKS);
		soundMap.put(Items.WARD_ARMOR_TRIM_SMITHING_TEMPLATE, SoundType.DEEPSLATE);
		soundMap.put(Items.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE, SoundType.GRAVEL);
		return soundMap.getOrDefault(target, SoundType.STONE);
	}

	private static SoundType getMusicDiscSound(Item target) {
		Map<Item, SoundType> soundMap = new HashMap<>();
		soundMap.put(Items.MUSIC_DISC_CREATOR, SoundType.COPPER);
		soundMap.put(Items.MUSIC_DISC_CREATOR_MUSIC_BOX, SoundType.COPPER);
		return soundMap.getOrDefault(target, SoundType.STONE);
	}

	private static SoundType getIngotSound(Item target, String id) {
		Map<Item, SoundType> soundMap = new HashMap<>();
		soundMap.put(Items.NETHER_BRICK, SoundType.NETHER_BRICKS);
		soundMap.put(Items.COPPER_INGOT, SoundType.COPPER);
		soundMap.put(Items.NETHERITE_INGOT, SoundType.NETHERITE_BLOCK);
		return soundMap.getOrDefault(target, id.contains("brick") ? SoundType.DECORATED_POT : SoundType.METAL);
	}

	private static SoundType getGemSound(String id) {
		Map<String, SoundType> soundMap = new HashMap<>();
		soundMap.put("amethyst_shard", SoundType.AMETHYST);
		soundMap.put("diamond", SoundType.METAL);
		soundMap.put("emerald", SoundType.METAL);
		soundMap.put("lapis_lazuli", SoundType.METAL);
		soundMap.put("echo_shard", SoundType.AMETHYST);
		soundMap.put("allurite_shard", SoundType.AMETHYST);
		soundMap.put("lumiere_shard", SoundType.AMETHYST);
		return soundMap.getOrDefault(id, SoundType.STONE);
	}
}