
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemPlatinumingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotPlatinum extends ElementsKindredCraft.ModElement {
	public OreDictIngotPlatinum(ElementsKindredCraft instance) {
		super(instance, 238);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotPlatinum", new ItemStack(ItemPlatinumingot.block, (int) (1)));
	}
}
