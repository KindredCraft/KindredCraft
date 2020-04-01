
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemArditeingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotArdite extends ElementsKindredCraft.ModElement {
	public OreDictIngotArdite(ElementsKindredCraft instance) {
		super(instance, 218);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotArdite", new ItemStack(ItemArditeingot.block, (int) (1)));
	}
}
