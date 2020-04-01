
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemSiliconingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictItemSilicon extends ElementsKindredCraft.ModElement {
	public OreDictItemSilicon(ElementsKindredCraft instance) {
		super(instance, 242);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("itemSilicon", new ItemStack(ItemSiliconingot.block, (int) (1)));
	}
}
