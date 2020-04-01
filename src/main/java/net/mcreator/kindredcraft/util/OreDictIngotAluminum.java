
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemAluminumIngot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotAluminum extends ElementsKindredCraft.ModElement {
	public OreDictIngotAluminum(ElementsKindredCraft instance) {
		super(instance, 325);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotAluminum", new ItemStack(ItemAluminumIngot.block, (int) (1)));
	}
}
