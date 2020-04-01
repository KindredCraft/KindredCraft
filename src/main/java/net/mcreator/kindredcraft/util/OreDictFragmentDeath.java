
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemFragDeath;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictFragmentDeath extends ElementsKindredCraft.ModElement {
	public OreDictFragmentDeath(ElementsKindredCraft instance) {
		super(instance, 348);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentDeath", new ItemStack(ItemFragDeath.block, (int) (1)));
	}
}
