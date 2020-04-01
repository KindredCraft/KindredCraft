
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemTiningot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotTin extends ElementsKindredCraft.ModElement {
	public OreDictIngotTin(ElementsKindredCraft instance) {
		super(instance, 244);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotTin", new ItemStack(ItemTiningot.block, (int) (1)));
	}
}
