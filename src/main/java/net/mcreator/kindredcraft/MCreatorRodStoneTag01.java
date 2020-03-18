package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorRodStoneTag01 extends Elementskindredcraft.ModElement {
	public MCreatorRodStoneTag01(Elementskindredcraft instance) {
		super(instance, 322);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("rodStone", new ItemStack(MCreatorRodStoneItem.block, (int) (1)));
	}
}
