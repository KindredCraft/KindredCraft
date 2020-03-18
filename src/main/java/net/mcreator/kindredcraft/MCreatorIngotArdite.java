package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotArdite extends Elementskindredcraft.ModElement {
	public MCreatorIngotArdite(Elementskindredcraft instance) {
		super(instance, 189);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotArdite", new ItemStack(MCreatorArditeingot.block, (int) (1)));
	}
}
