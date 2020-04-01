
package net.mcreator.kindredcraft.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.kindredcraft.block.BlockEndrachite;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class TabKindredCraftBlocks extends ElementsKindredCraft.ModElement {
	public TabKindredCraftBlocks(ElementsKindredCraft instance) {
		super(instance, 104);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabkindredcraftblocks") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockEndrachite.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
