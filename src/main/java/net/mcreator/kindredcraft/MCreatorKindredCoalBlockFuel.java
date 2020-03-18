package net.mcreator.kindredcraft;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorKindredCoalBlockFuel extends Elementskindredcraft.ModElement {
	public MCreatorKindredCoalBlockFuel(Elementskindredcraft instance) {
		super(instance, 69);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(MCreatorKindredCoalBlock.block, (int) (1)).getItem())
			return 57600;
		return 0;
	}
}
