package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorFragmentDeath extends Elementskindredcraft.ModElement {
	public MCreatorFragmentDeath(Elementskindredcraft instance) {
		super(instance, 335);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentDeath", new ItemStack(MCreatorFragDeath.block, (int) (1)));
	}
}
