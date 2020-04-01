
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemNickelingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotNickel extends ElementsKindredCraft.ModElement {
	public OreDictIngotNickel(ElementsKindredCraft instance) {
		super(instance, 235);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotNickel", new ItemStack(ItemNickelingot.block, (int) (1)));
	}
}
