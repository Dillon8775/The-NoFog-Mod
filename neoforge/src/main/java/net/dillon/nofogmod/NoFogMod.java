package net.dillon.nofogmod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(NoFogMod.MOD_ID)
public final class NoFogMod {
	public static final String MOD_ID = "nofogmod";
	private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public NoFogMod(IEventBus modEventBus) {
		LOGGER.info("The NoFog Mod has been loaded.");
	}
}