package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotAstralSilver extends Elementskindredcraft.ModElement {
	public MCreatorIngotAstralSilver(Elementskindredcraft instance) {
		super(instance, 190);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotAstralSilver", new ItemStack(MCreatorAstralSilveringot.block, (int) (1)));
	}
}
