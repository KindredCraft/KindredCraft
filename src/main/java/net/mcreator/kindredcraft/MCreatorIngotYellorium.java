package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotYellorium extends Elementskindredcraft.ModElement {
	public MCreatorIngotYellorium(Elementskindredcraft instance) {
		super(instance, 321);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotYellorium", new ItemStack(MCreatorYelloriumIngot.block, (int) (1)));
	}
}
