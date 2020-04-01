
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemFragDemonic;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictFragmentDemonic extends ElementsKindredCraft.ModElement {
	public OreDictFragmentDemonic(ElementsKindredCraft instance) {
		super(instance, 349);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentDemonic", new ItemStack(ItemFragDemonic.block, (int) (1)));
	}
}
