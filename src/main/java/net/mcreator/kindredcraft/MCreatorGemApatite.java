package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorGemApatite extends Elementskindredcraft.ModElement {
	public MCreatorGemApatite(Elementskindredcraft instance) {
		super(instance, 188);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("gemApatite", new ItemStack(MCreatorApatiteingot.block, (int) (1)));
	}
}
