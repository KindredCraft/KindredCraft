package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorFragmentShadow extends Elementskindredcraft.ModElement {
	public MCreatorFragmentShadow(Elementskindredcraft instance) {
		super(instance, 356);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentShadow", new ItemStack(MCreatorFragShadow.block, (int) (1)));
	}
}
