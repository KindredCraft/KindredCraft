
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemSanguiniteingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotSanguiniteTag extends ElementsKindredCraft.ModElement {
	public OreDictIngotSanguiniteTag(ElementsKindredCraft instance) {
		super(instance, 328);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotSanguinite", new ItemStack(ItemSanguiniteingot.block, (int) (1)));
	}
}
