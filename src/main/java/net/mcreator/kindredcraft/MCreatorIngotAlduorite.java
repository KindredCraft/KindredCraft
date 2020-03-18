package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotAlduorite extends Elementskindredcraft.ModElement {
	public MCreatorIngotAlduorite(Elementskindredcraft instance) {
		super(instance, 299);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotAlduorite", new ItemStack(MCreatorAlduoriteIngot.block, (int) (1)));
	}
}
