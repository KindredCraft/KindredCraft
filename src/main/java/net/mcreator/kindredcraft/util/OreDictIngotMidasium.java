
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemMidasiumingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotMidasium extends ElementsKindredCraft.ModElement {
	public OreDictIngotMidasium(ElementsKindredCraft instance) {
		super(instance, 233);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotMidasium", new ItemStack(ItemMidasiumingot.block, (int) (1)));
	}
}
