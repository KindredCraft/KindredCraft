package net.mcreator.kindredcraft;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementskindredcraft.ModElement.Tag
public class MCreatorFlesh extends Elementskindredcraft.ModElement {
	@GameRegistry.ObjectHolder("kindredcraft:flesh")
	public static final Item block = null;

	public MCreatorFlesh(Elementskindredcraft instance) {
		super(instance, 82);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("kindredcraft:flesh", "inventory"));
	}

	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(5, 0.5f, false);
			setUnlocalizedName("flesh");
			setRegistryName("flesh");
			setAlwaysEdible();
			setCreativeTab(MCreatorKindredCraftItems.tab);
			setMaxStackSize(32);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}
	}
}
