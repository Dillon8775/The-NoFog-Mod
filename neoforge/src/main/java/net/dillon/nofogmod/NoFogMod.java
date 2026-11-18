package net.dillon.nofogmod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(TheNoFogMod.MOD_ID)
public final class NoFogMod {

	public NoFogMod(IEventBus modEventBus) {
		TheNoFogMod.printMsg();
	}
}