
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemLemuriteingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotLemurite extends ElementsKindredCraft.ModElement {
	public OreDictIngotLemurite(ElementsKindredCraft instance) {
		super(instance, 230);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotLemurite", new ItemStack(ItemLemuriteingot.block, (int) (1)));
	}
}
