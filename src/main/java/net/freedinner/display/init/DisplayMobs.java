package net.freedinner.display.init;

import net.freedinner.display.Display;
import net.freedinner.display.entity.*;
import net.freedinner.display.events.DisplayManager;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;

@EventBusSubscriber
public class DisplayMobs {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, Display.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<ItemDisplay>> DISPLAY = register("item_display", EntityType.Builder.of(ItemDisplay::new, MobCategory.MISC).sized(0.45F, 0.75F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ItemPillow>> WHITE_PILLOW = register("white_jewelry_pillow", EntityType.Builder.of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ItemPillow>> LG_PILLOW = register("light_gray_jewelry_pillow", EntityType.Builder.of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ItemPillow>> GRAY_PILLOW = register("gray_jewelry_pillow", EntityType.Builder.of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ItemPillow>> BLACK_PILLOW = register("black_jewelry_pillow", EntityType.Builder.of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ItemPillow>> RED_PILLOW = register("red_jewelry_pillow", EntityType.Builder.of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ItemPillow>> ORANGE_PILLOW = register("orange_jewelry_pillow", EntityType.Builder.of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ItemPillow>> YELLOW_PILLOW = register("yellow_jewelry_pillow", EntityType.Builder.of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ItemPillow>> LIME_PILLOW = register("lime_jewelry_pillow", EntityType.Builder.of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ItemPillow>> GREEN_PILLOW = register("green_jewelry_pillow", EntityType.Builder.of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ItemPillow>> LB_PILLOW = register("light_blue_jewelry_pillow", EntityType.Builder.of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ItemPillow>> CYAN_PILLOW = register("cyan_jewelry_pillow", EntityType.Builder.of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ItemPillow>> BLUE_PILLOW = register("blue_jewelry_pillow", EntityType.Builder.of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ItemPillow>> PURPLE_PILLOW = register("purple_jewelry_pillow", EntityType.Builder.of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ItemPillow>> MAGE_PILLOW = register("magenta_jewelry_pillow", EntityType.Builder.of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ItemPillow>> PINK_PILLOW = register("pink_jewelry_pillow", EntityType.Builder.of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F).clientTrackingRange(10));
	public static final DeferredHolder<EntityType<?>, EntityType<ItemPillow>> BROWN_PILLOW = register("brown_jewelry_pillow", EntityType.Builder.of(ItemPillow::new, MobCategory.MISC).sized(0.56F, 0.45F).clientTrackingRange(10));

	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(Display.MODID, registryname))));
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DISPLAY.get(), DisplayManager.createAttributes().build());
		event.put(WHITE_PILLOW.get(), DisplayManager.createAttributes().build());
		event.put(LG_PILLOW.get(), DisplayManager.createAttributes().build());
		event.put(GRAY_PILLOW.get(), DisplayManager.createAttributes().build());
		event.put(BLACK_PILLOW.get(), DisplayManager.createAttributes().build());
		event.put(RED_PILLOW.get(), DisplayManager.createAttributes().build());
		event.put(ORANGE_PILLOW.get(), DisplayManager.createAttributes().build());
		event.put(YELLOW_PILLOW.get(), DisplayManager.createAttributes().build());
		event.put(LIME_PILLOW.get(), DisplayManager.createAttributes().build());
		event.put(GREEN_PILLOW.get(), DisplayManager.createAttributes().build());
		event.put(LB_PILLOW.get(), DisplayManager.createAttributes().build());
		event.put(CYAN_PILLOW.get(), DisplayManager.createAttributes().build());
		event.put(BLUE_PILLOW.get(), DisplayManager.createAttributes().build());
		event.put(PURPLE_PILLOW.get(), DisplayManager.createAttributes().build());
		event.put(MAGE_PILLOW.get(), DisplayManager.createAttributes().build());
		event.put(PINK_PILLOW.get(), DisplayManager.createAttributes().build());
		event.put(BROWN_PILLOW.get(), DisplayManager.createAttributes().build());
	}
}