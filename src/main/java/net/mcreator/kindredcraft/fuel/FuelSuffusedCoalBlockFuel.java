
package net.mcreator.kindredcraft.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.block.BlockSuffusedCoalBlock;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class FuelSuffusedCoalBlockFuel extends ElementsKindredCraft.ModElement {
	public FuelSuffusedCoalBlockFuel(ElementsKindredCraft instance) {
		super(instance, 167);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockSuffusedCoalBlock.block, (int) (1)).getItem())
			return 28800;
		return 0;
	}
}
