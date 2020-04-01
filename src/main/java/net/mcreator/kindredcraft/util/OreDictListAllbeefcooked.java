
package net.mcreator.kindredcraft.util;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemFlesh;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class OreDictListAllbeefcooked extends ElementsKindredCraft.ModElement {
	public OreDictListAllbeefcooked(ElementsKindredCraft instance) {
		super(instance, 339);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("listAllmeatcooked", new ItemStack(ItemFlesh.block, (int) (1)));
	}
}
