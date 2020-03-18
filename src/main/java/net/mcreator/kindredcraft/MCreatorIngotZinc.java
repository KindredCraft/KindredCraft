package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotZinc extends Elementskindredcraft.ModElement {
	public MCreatorIngotZinc(Elementskindredcraft instance) {
		super(instance, 221);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotZinc", new ItemStack(MCreatorZincingot.block, (int) (1)));
	}
}
