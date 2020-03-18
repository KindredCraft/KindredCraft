package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotRubracium extends Elementskindredcraft.ModElement {
	public MCreatorIngotRubracium(Elementskindredcraft instance) {
		super(instance, 212);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotRubracium", new ItemStack(MCreatorRubraciumingot.block, (int) (1)));
	}
}
