
package net.mcreator.kindredcraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.kindredcraft.item.ItemLightRottenFlesh;
import net.mcreator.kindredcraft.item.ItemFlesh;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class RecipeFleshRecipe extends ElementsKindredCraft.ModElement {
	public RecipeFleshRecipe(ElementsKindredCraft instance) {
		super(instance, 173);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemLightRottenFlesh.block, (int) (1)), new ItemStack(ItemFlesh.block, (int) (0)), 0F);
	}
}
