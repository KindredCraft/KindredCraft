
package net.mcreator.kindredcraft.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.kindredcraft.item.ItemDustMagichite;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class TabKindredCraftItems extends ElementsKindredCraft.ModElement {
	public TabKindredCraftItems(ElementsKindredCraft instance) {
		super(instance, 103);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabkindredcraftitems") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemDustMagichite.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
