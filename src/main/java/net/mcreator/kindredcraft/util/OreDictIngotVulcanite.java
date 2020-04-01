
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemVulcaniteingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotVulcanite extends ElementsKindredCraft.ModElement {
	public OreDictIngotVulcanite(ElementsKindredCraft instance) {
		super(instance, 246);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotVulcanite", new ItemStack(ItemVulcaniteingot.block, (int) (1)));
	}
}
