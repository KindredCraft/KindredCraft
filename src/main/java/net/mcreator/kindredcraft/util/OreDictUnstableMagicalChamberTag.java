
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemUnstableMagicalChamber;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictUnstableMagicalChamberTag extends ElementsKindredCraft.ModElement {
	public OreDictUnstableMagicalChamberTag(ElementsKindredCraft instance) {
		super(instance, 419);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotUranium", new ItemStack(ItemUnstableMagicalChamber.block, (int) (1)));
	}
}
