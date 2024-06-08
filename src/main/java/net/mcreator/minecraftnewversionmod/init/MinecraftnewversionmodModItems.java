/*
 *    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.minecraftnewversionmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.minecraftnewversionmod.item.FireballSpawnerItemItem;
import net.mcreator.minecraftnewversionmod.MinecraftnewversionmodMod;

public class MinecraftnewversionmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftnewversionmodMod.MODID);
	public static final RegistryObject<Item> FIREBALL_SPAWNER_ITEM = REGISTRY.register("fireball_spawner_item", () -> new FireballSpawnerItemItem());
	// Start of user code block custom items
	// End of user code block custom items
}
