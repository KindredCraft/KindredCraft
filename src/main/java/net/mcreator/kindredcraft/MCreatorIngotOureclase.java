package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotOureclase extends Elementskindredcraft.ModElement {
	public MCreatorIngotOureclase(Elementskindredcraft instance) {
		super(instance, 209);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotOureclase", new ItemStack(MCreatorOureclaseingot.block, (int) (1)));
	}
}
