
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemZincingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotZinc extends ElementsKindredCraft.ModElement {
	public OreDictIngotZinc(ElementsKindredCraft instance) {
		super(instance, 248);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotZinc", new ItemStack(ItemZincingot.block, (int) (1)));
	}
}
