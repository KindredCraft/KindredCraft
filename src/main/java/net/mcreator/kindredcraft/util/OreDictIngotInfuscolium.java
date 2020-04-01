
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemInfuscoliumingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotInfuscolium extends ElementsKindredCraft.ModElement {
	public OreDictIngotInfuscolium(ElementsKindredCraft instance) {
		super(instance, 227);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotInfuscolium", new ItemStack(ItemInfuscoliumingot.block, (int) (1)));
	}
}
