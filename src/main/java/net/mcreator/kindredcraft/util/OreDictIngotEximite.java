
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemEximiteingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotEximite extends ElementsKindredCraft.ModElement {
	public OreDictIngotEximite(ElementsKindredCraft instance) {
		super(instance, 225);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotEximite", new ItemStack(ItemEximiteingot.block, (int) (1)));
	}
}
