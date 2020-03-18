package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotOsmiumTag extends Elementskindredcraft.ModElement {
	public MCreatorIngotOsmiumTag(Elementskindredcraft instance) {
		super(instance, 326);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotOsmium", new ItemStack(MCreatorIngotOsmium.block, (int) (1)));
	}
}
