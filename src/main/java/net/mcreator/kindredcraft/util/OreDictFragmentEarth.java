
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemFragEarth;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictFragmentEarth extends ElementsKindredCraft.ModElement {
	public OreDictFragmentEarth(ElementsKindredCraft instance) {
		super(instance, 351);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentEarth", new ItemStack(ItemFragEarth.block, (int) (1)));
	}
}
