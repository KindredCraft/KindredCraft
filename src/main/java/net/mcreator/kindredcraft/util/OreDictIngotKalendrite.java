
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemKalendriteingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotKalendrite extends ElementsKindredCraft.ModElement {
	public OreDictIngotKalendrite(ElementsKindredCraft instance) {
		super(instance, 229);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotKalendrite", new ItemStack(ItemKalendriteingot.block, (int) (1)));
	}
}
