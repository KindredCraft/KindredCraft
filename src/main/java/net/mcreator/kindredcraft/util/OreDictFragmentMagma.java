
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemFragMagma;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictFragmentMagma extends ElementsKindredCraft.ModElement {
	public OreDictFragmentMagma(ElementsKindredCraft instance) {
		super(instance, 355);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentMagma", new ItemStack(ItemFragMagma.block, (int) (1)));
	}
}
