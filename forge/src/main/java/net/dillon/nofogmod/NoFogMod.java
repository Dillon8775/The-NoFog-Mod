package net.dillon.nofogmod;

import net.dillon.nofogmod.util.ModUtil;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModUtil.MOD_ID)
public final class NoFogMod {

	public NoFogMod(FMLJavaModLoadingContext context) {
		ModUtil.initializeSuccess();
	}
}