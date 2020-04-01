
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemFragFrost;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictFragmentFrost extends ElementsKindredCraft.ModElement {
	public OreDictFragmentFrost(ElementsKindredCraft instance) {
		super(instance, 352);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentFrost", new ItemStack(ItemFragFrost.block, (int) (1)));
	}
}
