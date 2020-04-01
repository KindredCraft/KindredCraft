
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemCopperingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotCopper extends ElementsKindredCraft.ModElement {
	public OreDictIngotCopper(ElementsKindredCraft instance) {
		super(instance, 324);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotCopper", new ItemStack(ItemCopperingot.block, (int) (1)));
	}
}
