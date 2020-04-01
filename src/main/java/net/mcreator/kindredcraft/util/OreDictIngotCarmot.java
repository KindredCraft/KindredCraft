
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemCarmotingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotCarmot extends ElementsKindredCraft.ModElement {
	public OreDictIngotCarmot(ElementsKindredCraft instance) {
		super(instance, 221);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotCarmot", new ItemStack(ItemCarmotingot.block, (int) (1)));
	}
}
