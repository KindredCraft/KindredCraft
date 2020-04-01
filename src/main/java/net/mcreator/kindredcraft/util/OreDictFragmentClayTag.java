
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemFragmentClay;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictFragmentClayTag extends ElementsKindredCraft.ModElement {
	public OreDictFragmentClayTag(ElementsKindredCraft instance) {
		super(instance, 347);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentClay", new ItemStack(ItemFragmentClay.block, (int) (1)));
	}
}
