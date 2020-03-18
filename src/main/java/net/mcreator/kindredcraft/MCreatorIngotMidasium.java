package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotMidasium extends Elementskindredcraft.ModElement {
	public MCreatorIngotMidasium(Elementskindredcraft instance) {
		super(instance, 205);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotMidasium", new ItemStack(MCreatorMidasiumingot.block, (int) (1)));
	}
}
