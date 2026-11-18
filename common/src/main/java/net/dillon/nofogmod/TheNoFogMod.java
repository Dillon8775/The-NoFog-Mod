package net.dillon.nofogmod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheNoFogMod {
    public static final String MOD_ID = "nofogmod";
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void printMsg() {
        LOGGER.info("The NoFog Mod has been loaded.");
    }
}