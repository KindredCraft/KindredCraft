package net.mcreator.kindredcraft;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorSuffusedCoalBlockFuel extends Elementskindredcraft.ModElement {
	public MCreatorSuffusedCoalBlockFuel(Elementskindredcraft instance) {
		super(instance, 73);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(MCreatorSuffusedCoalBlock.block, (int) (1)).getItem())
			return 28800;
		return 0;
	}
}
