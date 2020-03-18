package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotCobalt extends Elementskindredcraft.ModElement {
	public MCreatorIngotCobalt(Elementskindredcraft instance) {
		super(instance, 194);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotCobalt", new ItemStack(MCreatorCobaltingot.block, (int) (1)));
	}
}
