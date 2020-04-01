
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemFragLight;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictFragmentLight extends ElementsKindredCraft.ModElement {
	public OreDictFragmentLight(ElementsKindredCraft instance) {
		super(instance, 356);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentLight", new ItemStack(ItemFragLight.block, (int) (1)));
	}
}
