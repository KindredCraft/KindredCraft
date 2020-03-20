package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorFragmentSpiritual extends Elementskindredcraft.ModElement {
	public MCreatorFragmentSpiritual(Elementskindredcraft instance) {
		super(instance, 358);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentSpiritual", new ItemStack(MCreatorFragSpiritual.block, (int) (1)));
	}
}
