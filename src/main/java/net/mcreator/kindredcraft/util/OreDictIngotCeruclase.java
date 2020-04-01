
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemCeruclaseingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotCeruclase extends ElementsKindredCraft.ModElement {
	public OreDictIngotCeruclase(ElementsKindredCraft instance) {
		super(instance, 222);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotCeruclase", new ItemStack(ItemCeruclaseingot.block, (int) (1)));
	}
}
