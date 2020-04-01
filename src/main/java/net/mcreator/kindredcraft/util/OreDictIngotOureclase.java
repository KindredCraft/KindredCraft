
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemOureclaseingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotOureclase extends ElementsKindredCraft.ModElement {
	public OreDictIngotOureclase(ElementsKindredCraft instance) {
		super(instance, 237);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotOureclase", new ItemStack(ItemOureclaseingot.block, (int) (1)));
	}
}
