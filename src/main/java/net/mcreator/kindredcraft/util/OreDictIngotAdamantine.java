
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemAdamantineIngot;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictIngotAdamantine extends ElementsKindredCraft.ModElement {
	public OreDictIngotAdamantine(ElementsKindredCraft instance) {
		super(instance, 216);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotAdamantine", new ItemStack(ItemAdamantineIngot.block, (int) (1)));
	}
}
