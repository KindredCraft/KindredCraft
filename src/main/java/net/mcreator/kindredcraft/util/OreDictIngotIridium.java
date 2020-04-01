
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemIridiumingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotIridium extends ElementsKindredCraft.ModElement {
	public OreDictIngotIridium(ElementsKindredCraft instance) {
		super(instance, 228);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotIridium", new ItemStack(ItemIridiumingot.block, (int) (1)));
	}
}
