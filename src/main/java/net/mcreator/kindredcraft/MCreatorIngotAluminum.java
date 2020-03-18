package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotAluminum extends Elementskindredcraft.ModElement {
	public MCreatorIngotAluminum(Elementskindredcraft instance) {
		super(instance, 298);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotAluminum", new ItemStack(MCreatorAluminumIngot.block, (int) (1)));
	}
}
