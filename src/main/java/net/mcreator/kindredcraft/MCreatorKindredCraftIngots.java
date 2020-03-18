package net.mcreator.kindredcraft;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@Elementskindredcraft.ModElement.Tag
public class MCreatorKindredCraftIngots extends Elementskindredcraft.ModElement {
	public MCreatorKindredCraftIngots(Elementskindredcraft instance) {
		super(instance, 144);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabkindredcraftingots") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(MCreatorSuffusedIron.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
