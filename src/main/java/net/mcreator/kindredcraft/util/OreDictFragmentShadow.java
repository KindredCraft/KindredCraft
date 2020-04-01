
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemFragShadow;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictFragmentShadow extends ElementsKindredCraft.ModElement {
	public OreDictFragmentShadow(ElementsKindredCraft instance) {
		super(instance, 358);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentShadow", new ItemStack(ItemFragShadow.block, (int) (1)));
	}
}
