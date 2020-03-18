package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotEximite extends Elementskindredcraft.ModElement {
	public MCreatorIngotEximite(Elementskindredcraft instance) {
		super(instance, 196);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotEximite", new ItemStack(MCreatorEximiteingot.block, (int) (1)));
	}
}
