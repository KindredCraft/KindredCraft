
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemOrichalcumingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotOrichalcum extends ElementsKindredCraft.ModElement {
	public OreDictIngotOrichalcum(ElementsKindredCraft instance) {
		super(instance, 236);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotOrichalcum", new ItemStack(ItemOrichalcumingot.block, (int) (1)));
	}
}
