package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorSuffusedIronTag extends Elementskindredcraft.ModElement {
	public MCreatorSuffusedIronTag(Elementskindredcraft instance) {
		super(instance, 184);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotSuffusedIron", new ItemStack(MCreatorSuffusedIron.block, (int) (1)));
	}
}
