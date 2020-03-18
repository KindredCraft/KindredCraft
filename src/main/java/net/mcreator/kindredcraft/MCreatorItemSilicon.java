package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorItemSilicon extends Elementskindredcraft.ModElement {
	public MCreatorItemSilicon(Elementskindredcraft instance) {
		super(instance, 215);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("itemSilicon", new ItemStack(MCreatorSiliconingot.block, (int) (1)));
	}
}
