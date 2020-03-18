package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotSanguiniteTag extends Elementskindredcraft.ModElement {
	public MCreatorIngotSanguiniteTag(Elementskindredcraft instance) {
		super(instance, 301);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotSanguinite", new ItemStack(MCreatorSanguiniteingot.block, (int) (1)));
	}
}
