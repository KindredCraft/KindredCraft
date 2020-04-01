
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemAstralSilveringot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotAstralSilver extends ElementsKindredCraft.ModElement {
	public OreDictIngotAstralSilver(ElementsKindredCraft instance) {
		super(instance, 219);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotAstralSilver", new ItemStack(ItemAstralSilveringot.block, (int) (1)));
	}
}
