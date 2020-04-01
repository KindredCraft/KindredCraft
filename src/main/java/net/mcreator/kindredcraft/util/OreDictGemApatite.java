
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemApatiteingot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictGemApatite extends ElementsKindredCraft.ModElement {
	public OreDictGemApatite(ElementsKindredCraft instance) {
		super(instance, 217);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("gemApatite", new ItemStack(ItemApatiteingot.block, (int) (1)));
	}
}
