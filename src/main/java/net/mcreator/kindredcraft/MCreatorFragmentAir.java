package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorFragmentAir extends Elementskindredcraft.ModElement {
	public MCreatorFragmentAir(Elementskindredcraft instance) {
		super(instance, 331);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentAir", new ItemStack(MCreatorFragAir.block, (int) (1)));
	}
}
