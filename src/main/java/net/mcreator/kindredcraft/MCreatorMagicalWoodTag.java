package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorMagicalWoodTag extends Elementskindredcraft.ModElement {
	public MCreatorMagicalWoodTag(Elementskindredcraft instance) {
		super(instance, 327);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("blockMagicalWood", new ItemStack(MCreatorInertMagicalWood.block, (int) (1)));
	}
}
