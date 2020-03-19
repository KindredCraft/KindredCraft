package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorFragmentDemonic extends Elementskindredcraft.ModElement {
	public MCreatorFragmentDemonic(Elementskindredcraft instance) {
		super(instance, 337);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentDemonic", new ItemStack(MCreatorFragDemonic.block, (int) (1)));
	}
}
