
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemAlduoriteIngot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotAlduorite extends ElementsKindredCraft.ModElement {
	public OreDictIngotAlduorite(ElementsKindredCraft instance) {
		super(instance, 326);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotAlduorite", new ItemStack(ItemAlduoriteIngot.block, (int) (1)));
	}
}
