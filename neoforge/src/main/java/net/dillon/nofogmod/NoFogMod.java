package net.dillon.nofogmod;

import net.dillon.nofogmod.helper.ModHelper;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ModHelper.MOD_ID)
public final class NoFogMod {

	public NoFogMod(IEventBus modEventBus) {
		ModHelper.initializeSuccess();
	}
}