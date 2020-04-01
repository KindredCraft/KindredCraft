
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemUraniumingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotUranium extends ElementsKindredCraft.ModElement {
	public OreDictIngotUranium(ElementsKindredCraft instance) {
		super(instance, 245);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotUranium", new ItemStack(ItemUraniumingot.block, (int) (1)));
	}
}
