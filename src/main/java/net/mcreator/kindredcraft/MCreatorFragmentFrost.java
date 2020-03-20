package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorFragmentFrost extends Elementskindredcraft.ModElement {
	public MCreatorFragmentFrost(Elementskindredcraft instance) {
		super(instance, 344);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentFrost", new ItemStack(MCreatorFragFrost.block, (int) (1)));
	}
}
