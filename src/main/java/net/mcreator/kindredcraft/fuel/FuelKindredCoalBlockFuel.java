
package net.mcreator.kindredcraft.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.block.BlockKindredCoalBlock;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class FuelKindredCoalBlockFuel extends ElementsKindredCraft.ModElement {
	public FuelKindredCoalBlockFuel(ElementsKindredCraft instance) {
		super(instance, 164);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(BlockKindredCoalBlock.block, (int) (1)).getItem())
			return 57600;
		return 0;
	}
}
