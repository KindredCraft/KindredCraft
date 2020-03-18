package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotOrichalcum extends Elementskindredcraft.ModElement {
	public MCreatorIngotOrichalcum(Elementskindredcraft instance) {
		super(instance, 208);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotOrichalcum", new ItemStack(MCreatorOrichalcumingot.block, (int) (1)));
	}
}
