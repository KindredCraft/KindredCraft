
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.block.BlockInertMagicalWood;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictMagicalWoodTag extends ElementsKindredCraft.ModElement {
	public OreDictMagicalWoodTag(ElementsKindredCraft instance) {
		super(instance, 345);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("blockMagicalWood", new ItemStack(BlockInertMagicalWood.block, (int) (1)));
	}
}
