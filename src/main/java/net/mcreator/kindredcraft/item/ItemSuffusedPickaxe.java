
package net.mcreator.kindredcraft.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.kindredcraft.ElementsKindredCraft;

import java.util.Set;
import java.util.HashMap;

@ElementsKindredCraft.ModElement.Tag
public class ItemSuffusedPickaxe extends ElementsKindredCraft.ModElement {
	@GameRegistry.ObjectHolder("kindredcraft:suffusedpickaxe")
	public static final Item block = null;
	public ItemSuffusedPickaxe(ElementsKindredCraft instance) {
		super(instance, 97);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("SUFFUSEDPICKAXE", 8, 1741, 14f, 4f, 56)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 8);
				return ret.keySet();
			}
		}.setUnlocalizedName("suffusedpickaxe").setRegistryName("suffusedpickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("kindredcraft:suffusedpickaxe", "inventory"));
	}
}
