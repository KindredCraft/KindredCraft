package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorIngotMeutoite extends Elementskindredcraft.ModElement {
	public MCreatorIngotMeutoite(Elementskindredcraft instance) {
		super(instance, 204);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("ingotMeutoite", new ItemStack(MCreatorMeutoiteingot.block, (int) (1)));
	}
}
