package net.mcreator.kindredcraft;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

@Elementskindredcraft.ModElement.Tag
public class MCreatorFleshtoLeatherRecipe extends Elementskindredcraft.ModElement {
	public MCreatorFleshtoLeatherRecipe(Elementskindredcraft instance) {
		super(instance, 84);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorFlesh.block, (int) (1)), new ItemStack(Items.LEATHER, (int) (1)), 10F);
	}
}
