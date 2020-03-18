package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotCeruclase extends Elementskindredcraft.ModElement {
	public MCreatorIngotCeruclase(Elementskindredcraft instance) {
		super(instance, 193);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotCeruclase", new ItemStack(MCreatorCeruclaseingot.block, (int) (1)));
	}
}
