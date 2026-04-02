package net.dillon.nofogmod;

import net.dillon.nofogmod.util.ModUtil;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class NoFogMod implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		ModUtil.initializeSuccess();
	}
}