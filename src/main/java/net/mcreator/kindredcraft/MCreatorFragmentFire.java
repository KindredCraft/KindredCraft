package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorFragmentFire extends Elementskindredcraft.ModElement {
	public MCreatorFragmentFire(Elementskindredcraft instance) {
		super(instance, 346);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("fragmentFire", new ItemStack(MCreatorFragFire.block, (int) (1)));
	}
}
