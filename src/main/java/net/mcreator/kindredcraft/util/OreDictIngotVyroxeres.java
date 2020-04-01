
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemVyroxeresingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotVyroxeres extends ElementsKindredCraft.ModElement {
	public OreDictIngotVyroxeres(ElementsKindredCraft instance) {
		super(instance, 247);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotVyroxeres", new ItemStack(ItemVyroxeresingot.block, (int) (1)));
	}
}
