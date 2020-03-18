package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotVulcanite extends Elementskindredcraft.ModElement {
	public MCreatorIngotVulcanite(Elementskindredcraft instance) {
		super(instance, 219);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotVulcanite", new ItemStack(MCreatorVulcaniteingot.block, (int) (1)));
	}
}
