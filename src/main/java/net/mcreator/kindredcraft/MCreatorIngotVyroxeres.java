package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotVyroxeres extends Elementskindredcraft.ModElement {
	public MCreatorIngotVyroxeres(Elementskindredcraft instance) {
		super(instance, 220);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotVyroxeres", new ItemStack(MCreatorVyroxeresingot.block, (int) (1)));
	}
}
