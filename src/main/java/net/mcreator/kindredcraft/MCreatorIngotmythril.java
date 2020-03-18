package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotmythril extends Elementskindredcraft.ModElement {
	public MCreatorIngotmythril(Elementskindredcraft instance) {
		super(instance, 206);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotMythril", new ItemStack(MCreatorMythrilingot.block, (int) (1)));
	}
}
