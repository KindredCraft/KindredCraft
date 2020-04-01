
package net.mcreator.kindredcraft.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemSuffusedCoal;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class FuelSuffusedFuel extends ElementsKindredCraft.ModElement {
	public FuelSuffusedFuel(ElementsKindredCraft instance) {
		super(instance, 160);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemSuffusedCoal.block, (int) (1)).getItem())
			return 3200;
		return 0;
	}
}
