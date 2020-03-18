package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotPlatinum extends Elementskindredcraft.ModElement {
	public MCreatorIngotPlatinum(Elementskindredcraft instance) {
		super(instance, 210);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotPlatinum", new ItemStack(MCreatorPlatinumingot.block, (int) (1)));
	}
}
