
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemFragDevine;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictFragmentDevine extends ElementsKindredCraft.ModElement {
	public OreDictFragmentDevine(ElementsKindredCraft instance) {
		super(instance, 350);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentDevine", new ItemStack(ItemFragDevine.block, (int) (1)));
	}
}
