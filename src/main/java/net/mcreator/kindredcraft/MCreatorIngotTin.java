package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotTin extends Elementskindredcraft.ModElement {
	public MCreatorIngotTin(Elementskindredcraft instance) {
		super(instance, 217);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotTin", new ItemStack(MCreatorTiningot.block, (int) (1)));
	}
}
