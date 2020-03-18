package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotKalendrite extends Elementskindredcraft.ModElement {
	public MCreatorIngotKalendrite(Elementskindredcraft instance) {
		super(instance, 200);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotKalendrite", new ItemStack(MCreatorKalendriteingot.block, (int) (1)));
	}
}
