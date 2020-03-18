package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotIridium extends Elementskindredcraft.ModElement {
	public MCreatorIngotIridium(Elementskindredcraft instance) {
		super(instance, 199);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotIridium", new ItemStack(MCreatorIridiumingot.block, (int) (1)));
	}
}
