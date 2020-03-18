package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotShadowIron extends Elementskindredcraft.ModElement {
	public MCreatorIngotShadowIron(Elementskindredcraft instance) {
		super(instance, 214);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotShadowIron", new ItemStack(MCreatorShadowIroningot.block, (int) (1)));
	}
}
