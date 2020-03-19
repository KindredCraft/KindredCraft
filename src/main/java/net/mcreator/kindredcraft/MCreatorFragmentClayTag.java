package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorFragmentClayTag extends Elementskindredcraft.ModElement {
	public MCreatorFragmentClayTag(Elementskindredcraft instance) {
		super(instance, 333);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentClay", new ItemStack(MCreatorFragmentClay.block, (int) (1)));
	}
}
