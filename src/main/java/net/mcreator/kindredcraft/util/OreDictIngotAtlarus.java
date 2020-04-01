
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemAtlarusingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotAtlarus extends ElementsKindredCraft.ModElement {
	public OreDictIngotAtlarus(ElementsKindredCraft instance) {
		super(instance, 220);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotAtlarus", new ItemStack(ItemAtlarusingot.block, (int) (1)));
	}
}
