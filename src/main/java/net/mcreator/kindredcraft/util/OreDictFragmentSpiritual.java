
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemFragSpiritual;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictFragmentSpiritual extends ElementsKindredCraft.ModElement {
	public OreDictFragmentSpiritual(ElementsKindredCraft instance) {
		super(instance, 359);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentSpiritual", new ItemStack(ItemFragSpiritual.block, (int) (1)));
	}
}
