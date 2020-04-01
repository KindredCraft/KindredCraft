
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemLeadingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotLeadTag extends ElementsKindredCraft.ModElement {
	public OreDictIngotLeadTag(ElementsKindredCraft instance) {
		super(instance, 327);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotLead", new ItemStack(ItemLeadingot.block, (int) (1)));
	}
}
