
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemRubraciumingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotRubracium extends ElementsKindredCraft.ModElement {
	public OreDictIngotRubracium(ElementsKindredCraft instance) {
		super(instance, 240);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotRubracium", new ItemStack(ItemRubraciumingot.block, (int) (1)));
	}
}
