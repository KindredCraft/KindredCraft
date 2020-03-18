package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotNickel extends Elementskindredcraft.ModElement {
	public MCreatorIngotNickel(Elementskindredcraft instance) {
		super(instance, 207);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotNickel", new ItemStack(MCreatorNickelingot.block, (int) (1)));
	}
}
