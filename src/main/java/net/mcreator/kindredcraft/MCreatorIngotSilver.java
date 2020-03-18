package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotSilver extends Elementskindredcraft.ModElement {
	public MCreatorIngotSilver(Elementskindredcraft instance) {
		super(instance, 216);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotSilver", new ItemStack(MCreatorSilveringot.block, (int) (1)));
	}
}
