
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemMeutoiteingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotMeutoite extends ElementsKindredCraft.ModElement {
	public OreDictIngotMeutoite(ElementsKindredCraft instance) {
		super(instance, 232);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotMeutoite", new ItemStack(ItemMeutoiteingot.block, (int) (1)));
	}
}
