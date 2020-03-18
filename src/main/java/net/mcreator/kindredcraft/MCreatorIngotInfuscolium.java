package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotInfuscolium extends Elementskindredcraft.ModElement {
	public MCreatorIngotInfuscolium(Elementskindredcraft instance) {
		super(instance, 198);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotInfuscolium", new ItemStack(MCreatorInfuscoliumingot.block, (int) (1)));
	}
}
