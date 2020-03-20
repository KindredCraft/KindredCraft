package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorFragmentDevine extends Elementskindredcraft.ModElement {
	public MCreatorFragmentDevine(Elementskindredcraft instance) {
		super(instance, 340);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentDevine", new ItemStack(MCreatorFragDevine.block, (int) (1)));
	}
}
