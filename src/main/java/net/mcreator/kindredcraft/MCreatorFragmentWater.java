package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorFragmentWater extends Elementskindredcraft.ModElement {
	public MCreatorFragmentWater(Elementskindredcraft instance) {
		super(instance, 360);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentWater", new ItemStack(MCreatorFragWater.block, (int) (1)));
	}
}
