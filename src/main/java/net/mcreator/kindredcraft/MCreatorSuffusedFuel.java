package net.mcreator.kindredcraft;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorSuffusedFuel extends Elementskindredcraft.ModElement {
	public MCreatorSuffusedFuel(Elementskindredcraft instance) {
		super(instance, 65);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(MCreatorSuffusedCoal.block, (int) (1)).getItem())
			return 3200;
		return 0;
	}
}
