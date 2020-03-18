package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotAdamantine extends Elementskindredcraft.ModElement {
	public MCreatorIngotAdamantine(Elementskindredcraft instance) {
		super(instance, 185);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotAdamantine", new ItemStack(MCreatorAdamantineIngot.block, (int) (1)));
	}
}
