package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotCarmot extends Elementskindredcraft.ModElement {
	public MCreatorIngotCarmot(Elementskindredcraft instance) {
		super(instance, 192);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotCarmot", new ItemStack(MCreatorCarmotingot.block, (int) (1)));
	}
}
