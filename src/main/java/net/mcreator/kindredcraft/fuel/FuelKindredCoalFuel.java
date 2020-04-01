
package net.mcreator.kindredcraft.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemKindredCoal;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class FuelKindredCoalFuel extends ElementsKindredCraft.ModElement {
	public FuelKindredCoalFuel(ElementsKindredCraft instance) {
		super(instance, 163);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemKindredCoal.block, (int) (1)).getItem())
			return 6400;
		return 0;
	}
}
