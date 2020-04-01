
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemDustAir;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictDustAirTag extends ElementsKindredCraft.ModElement {
	public OreDictDustAirTag(ElementsKindredCraft instance) {
		super(instance, 361);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("dustAir", new ItemStack(ItemDustAir.block, (int) (1)));
	}
}
