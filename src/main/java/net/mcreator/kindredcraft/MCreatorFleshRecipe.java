package net.mcreator.kindredcraft;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementskindredcraft.ModElement.Tag
public class MCreatorFleshRecipe extends Elementskindredcraft.ModElement {
	public MCreatorFleshRecipe(Elementskindredcraft instance) {
		super(instance, 83);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorLightRottenFlesh.block, (int) (1)), new ItemStack(MCreatorFlesh.block, (int) (1)), 10F);
	}
}
