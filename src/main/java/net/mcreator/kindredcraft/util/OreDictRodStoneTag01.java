
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemRodStoneItem;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictRodStoneTag01 extends ElementsKindredCraft.ModElement {
	public OreDictRodStoneTag01(ElementsKindredCraft instance) {
		super(instance, 341);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("rodStone", new ItemStack(ItemRodStoneItem.block, (int) (1)));
	}
}
