package net.mcreator.kindredcraft;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementskindredcraft.ModElement.Tag
public class MCreatorSuffusedArmor extends Elementskindredcraft.ModElement {
	@GameRegistry.ObjectHolder("kindredcraft:suffusedarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("kindredcraft:suffusedarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("kindredcraft:suffusedarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("kindredcraft:suffusedarmorboots")
	public static final Item boots = null;

	public MCreatorSuffusedArmor(Elementskindredcraft instance) {
		super(instance, 313);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("SUFFUSEDARMOR", "kindredcraft:suffused", 60, new int[]{8, 24, 20, 8}, 36,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("suffusedarmorhelmet")
				.setRegistryName("suffusedarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("suffusedarmorbody")
				.setRegistryName("suffusedarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("suffusedarmorlegs")
				.setRegistryName("suffusedarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("suffusedarmorboots")
				.setRegistryName("suffusedarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("kindredcraft:suffusedarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("kindredcraft:suffusedarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("kindredcraft:suffusedarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("kindredcraft:suffusedarmorboots", "inventory"));
	}
}
