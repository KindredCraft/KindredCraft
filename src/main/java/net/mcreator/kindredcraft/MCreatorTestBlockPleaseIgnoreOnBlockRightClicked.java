package net.mcreator.kindredcraft;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

@Elementskindredcraft.ModElement.Tag
public class MCreatorTestBlockPleaseIgnoreOnBlockRightClicked extends Elementskindredcraft.ModElement {
	public MCreatorTestBlockPleaseIgnoreOnBlockRightClicked(Elementskindredcraft instance) {
		super(instance, 381);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorTestBlockPleaseIgnoreOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorTestBlockPleaseIgnoreOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorTestBlockPleaseIgnoreOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorTestBlockPleaseIgnoreOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorTestBlockPleaseIgnoreOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(kindredcraft.instance, MCreatorTestGui.GUIID, world, x, y, z);
	}
}
