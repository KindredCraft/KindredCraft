package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotUranium extends Elementskindredcraft.ModElement {
	public MCreatorIngotUranium(Elementskindredcraft instance) {
		super(instance, 218);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotUranium", new ItemStack(MCreatorUraniumingot.block, (int) (1)));
	}
}
