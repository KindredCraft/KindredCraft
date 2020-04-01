package net.mcreator.kindredcraft.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.kindredcraft.gui.GuiElementalCrystalizationChamber;
import net.mcreator.kindredcraft.KindredCraft;
import net.mcreator.kindredcraft.ElementsKindredCraft;

@ElementsKindredCraft.ModElement.Tag
public class ProcedureElementalCrystallizationChamberOnBlockRightClicked extends ElementsKindredCraft.ModElement {
	public ProcedureElementalCrystallizationChamberOnBlockRightClicked(ElementsKindredCraft instance) {
		super(instance, 367);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ElementalCrystallizationChamberOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ElementalCrystallizationChamberOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ElementalCrystallizationChamberOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ElementalCrystallizationChamberOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ElementalCrystallizationChamberOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(KindredCraft.instance, GuiElementalCrystalizationChamber.GUIID, world, x, y, z);
	}
}
