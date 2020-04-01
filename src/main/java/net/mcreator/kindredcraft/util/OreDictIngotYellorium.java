
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemYelloriumIngot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotYellorium extends ElementsKindredCraft.ModElement {
	public OreDictIngotYellorium(ElementsKindredCraft instance) {
		super(instance, 340);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotYellorium", new ItemStack(ItemYelloriumIngot.block, (int) (1)));
	}
}
