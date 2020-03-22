package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorDustAirTag extends Elementskindredcraft.ModElement {
	public MCreatorDustAirTag(Elementskindredcraft instance) {
		super(instance, 377);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("dustAir", new ItemStack(MCreatorDustAir.block, (int) (1)));
	}
}
