package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorFragmentMagma extends Elementskindredcraft.ModElement {
	public MCreatorFragmentMagma(Elementskindredcraft instance) {
		super(instance, 351);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentMagma", new ItemStack(MCreatorFragMagma.block, (int) (1)));
	}
}
