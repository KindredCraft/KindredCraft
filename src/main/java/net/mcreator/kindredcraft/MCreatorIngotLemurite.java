package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotLemurite extends Elementskindredcraft.ModElement {
	public MCreatorIngotLemurite(Elementskindredcraft instance) {
		super(instance, 202);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotLemurite", new ItemStack(MCreatorLemuriteingot.block, (int) (1)));
	}
}
