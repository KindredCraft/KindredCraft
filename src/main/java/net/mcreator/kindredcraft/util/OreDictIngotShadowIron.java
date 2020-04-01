
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemShadowIroningot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotShadowIron extends ElementsKindredCraft.ModElement {
	public OreDictIngotShadowIron(ElementsKindredCraft instance) {
		super(instance, 241);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotShadowIron", new ItemStack(ItemShadowIroningot.block, (int) (1)));
	}
}
