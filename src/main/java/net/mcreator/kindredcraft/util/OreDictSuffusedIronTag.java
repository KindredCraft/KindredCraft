
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemSuffusedIron;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictSuffusedIronTag extends ElementsKindredCraft.ModElement {
	public OreDictSuffusedIronTag(ElementsKindredCraft instance) {
		super(instance, 215);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotSuffusedIron", new ItemStack(ItemSuffusedIron.block, (int) (1)));
	}
}
