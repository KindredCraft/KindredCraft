
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemMythrilingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotmythril extends ElementsKindredCraft.ModElement {
	public OreDictIngotmythril(ElementsKindredCraft instance) {
		super(instance, 234);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotMythril", new ItemStack(ItemMythrilingot.block, (int) (1)));
	}
}
