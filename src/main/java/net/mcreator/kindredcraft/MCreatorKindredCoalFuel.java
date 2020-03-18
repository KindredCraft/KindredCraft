package net.mcreator.kindredcraft;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorKindredCoalFuel extends Elementskindredcraft.ModElement {
	public MCreatorKindredCoalFuel(Elementskindredcraft instance) {
		super(instance, 68);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(MCreatorKindredCoal.block, (int) (1)).getItem())
			return 6400;
		return 0;
	}
}
