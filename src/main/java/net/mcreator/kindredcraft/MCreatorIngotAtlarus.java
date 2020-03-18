package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotAtlarus extends Elementskindredcraft.ModElement {
	public MCreatorIngotAtlarus(Elementskindredcraft instance) {
		super(instance, 191);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotAtlarus", new ItemStack(MCreatorAtlarusingot.block, (int) (1)));
	}
}
