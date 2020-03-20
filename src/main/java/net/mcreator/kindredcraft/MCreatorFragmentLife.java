package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorFragmentLife extends Elementskindredcraft.ModElement {
	public MCreatorFragmentLife(Elementskindredcraft instance) {
		super(instance, 355);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentLife", new ItemStack(MCreatorFragLife.block, (int) (1)));
	}
}
