package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotPrometheum extends Elementskindredcraft.ModElement {
	public MCreatorIngotPrometheum(Elementskindredcraft instance) {
		super(instance, 211);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotPrometheum", new ItemStack(MCreatorPrometheumingot.block, (int) (1)));
	}
}
