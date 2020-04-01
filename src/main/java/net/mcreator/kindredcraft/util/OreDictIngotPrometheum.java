
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemPrometheumingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotPrometheum extends ElementsKindredCraft.ModElement {
	public OreDictIngotPrometheum(ElementsKindredCraft instance) {
		super(instance, 239);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotPrometheum", new ItemStack(ItemPrometheumingot.block, (int) (1)));
	}
}
