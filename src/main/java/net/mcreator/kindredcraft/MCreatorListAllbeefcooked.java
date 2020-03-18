package net.mcreator.kindredcraft;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorListAllbeefcooked extends Elementskindredcraft.ModElement {
	public MCreatorListAllbeefcooked(Elementskindredcraft instance) {
		super(instance, 319);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("listAllmeatcooked", new ItemStack(MCreatorFlesh.block, (int) (1)));
	}
}
