package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotLeadTag extends Elementskindredcraft.ModElement {
	public MCreatorIngotLeadTag(Elementskindredcraft instance) {
		super(instance, 300);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotLead", new ItemStack(MCreatorLeadingot.block, (int) (1)));
	}
}
