
package net.mcreator.kindredcraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

import net.mcreator.kindredcraft.item.ItemFlesh;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class RecipeFleshtoLeatherRecipe extends ElementsKindredCraft.ModElement {
	public RecipeFleshtoLeatherRecipe(ElementsKindredCraft instance) {
		super(instance, 174);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemFlesh.block, (int) (1)), new ItemStack(Items.LEATHER, (int) (0)), 0F);
	}
}
