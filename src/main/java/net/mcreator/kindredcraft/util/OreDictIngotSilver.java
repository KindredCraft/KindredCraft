
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemSilveringot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotSilver extends ElementsKindredCraft.ModElement {
	public OreDictIngotSilver(ElementsKindredCraft instance) {
		super(instance, 243);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotSilver", new ItemStack(ItemSilveringot.block, (int) (1)));
	}
}
