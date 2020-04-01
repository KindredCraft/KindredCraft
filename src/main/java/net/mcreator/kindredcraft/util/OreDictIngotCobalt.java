
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemCobaltingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotCobalt extends ElementsKindredCraft.ModElement {
	public OreDictIngotCobalt(ElementsKindredCraft instance) {
		super(instance, 223);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotCobalt", new ItemStack(ItemCobaltingot.block, (int) (1)));
	}
}
