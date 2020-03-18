package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotDeepIron extends Elementskindredcraft.ModElement {
	public MCreatorIngotDeepIron(Elementskindredcraft instance) {
		super(instance, 195);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotDeepIron", new ItemStack(MCreatorDeepIroningot.block, (int) (1)));
	}
}
