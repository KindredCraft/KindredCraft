package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorFragmentLight extends Elementskindredcraft.ModElement {
	public MCreatorFragmentLight(Elementskindredcraft instance) {
		super(instance, 353);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentLight", new ItemStack(MCreatorFragLight.block, (int) (1)));
	}
}
