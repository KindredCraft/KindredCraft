package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorFragmentEarth extends Elementskindredcraft.ModElement {
	public MCreatorFragmentEarth(Elementskindredcraft instance) {
		super(instance, 342);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentEarth", new ItemStack(MCreatorFragEarth.block, (int) (1)));
	}
}
