/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftnewversionmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.minecraftnewversionmod.MinecraftnewversionmodMod;

public class MinecraftnewversionmodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MinecraftnewversionmodMod.MODID);
	public static final RegistryObject<SoundEvent> SUPERMUSICUSSR = REGISTRY.register("supermusicussr", () -> new SoundEvent(new ResourceLocation("minecraftnewversionmod", "supermusicussr")));
}
