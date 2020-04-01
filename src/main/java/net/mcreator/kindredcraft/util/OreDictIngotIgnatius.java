
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemIgnatiusingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotIgnatius extends ElementsKindredCraft.ModElement {
	public OreDictIngotIgnatius(ElementsKindredCraft instance) {
		super(instance, 226);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotIgnatius", new ItemStack(ItemIgnatiusingot.block, (int) (1)));
	}
}
