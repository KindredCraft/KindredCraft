
package net.mcreator.kindredcraft.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.kindredcraft.creativetab.TabKindredCraftItems;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class ItemAlchemicalSubstance extends ElementsKindredCraft.ModElement {
	@GameRegistry.ObjectHolder("kindredcraft:alchemicalsubstance")
	public static final Item block = null;
	public ItemAlchemicalSubstance(ElementsKindredCraft instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("kindredcraft:alchemicalsubstance", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 32;
			setUnlocalizedName("alchemicalsubstance");
			setRegistryName("alchemicalsubstance");
			setCreativeTab(TabKindredCraftItems.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

		@Override
		@SideOnly(Side.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
