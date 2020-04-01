
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemManganeseingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotManganese extends ElementsKindredCraft.ModElement {
	public OreDictIngotManganese(ElementsKindredCraft instance) {
		super(instance, 231);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotManganese", new ItemStack(ItemManganeseingot.block, (int) (1)));
	}
}
