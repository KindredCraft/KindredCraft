package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotIgnatius extends Elementskindredcraft.ModElement {
	public MCreatorIngotIgnatius(Elementskindredcraft instance) {
		super(instance, 197);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotIgnatius", new ItemStack(MCreatorIgnatiusingot.block, (int) (1)));
	}
}
