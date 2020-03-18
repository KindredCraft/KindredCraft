package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotManganese extends Elementskindredcraft.ModElement {
	public MCreatorIngotManganese(Elementskindredcraft instance) {
		super(instance, 203);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotManganese", new ItemStack(MCreatorManganeseingot.block, (int) (1)));
	}
}
