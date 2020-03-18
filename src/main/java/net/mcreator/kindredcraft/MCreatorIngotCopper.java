package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotCopper extends Elementskindredcraft.ModElement {
	public MCreatorIngotCopper(Elementskindredcraft instance) {
		super(instance, 297);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotCopper", new ItemStack(MCreatorCopperingot.block, (int) (1)));
	}
}
