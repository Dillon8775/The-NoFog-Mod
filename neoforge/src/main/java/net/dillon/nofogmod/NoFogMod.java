package net.dillon.nofogmod;

import net.dillon.nofogmod.util.ModUtil;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ModUtil.MOD_ID)
public final class NoFogMod {

	public NoFogMod(IEventBus modEventBus) {
		ModUtil.initializeSuccess();
	}
}