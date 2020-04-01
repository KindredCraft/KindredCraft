
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemDeepIroningot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotDeepIron extends ElementsKindredCraft.ModElement {
	public OreDictIngotDeepIron(ElementsKindredCraft instance) {
		super(instance, 224);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotDeepIron", new ItemStack(ItemDeepIroningot.block, (int) (1)));
	}
}
