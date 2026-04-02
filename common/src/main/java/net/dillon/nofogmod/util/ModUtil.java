package net.dillon.nofogmod.util;

import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.FogType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModUtil {
    public static final String MOD_ID = "nofogmod";
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void initializeSuccess() {
        LOGGER.info("The NoFog Mod has been loaded.");
    }

    public static float handleFog(LocalPlayer player, FogType fogtype, FogRenderer.FogMode fogMode, float f, boolean bl) {
        boolean nether = player.level().dimension() == Level.NETHER;
        if (bl && !nether) {
            return Math.min(f, 192.0F) * 0.5F;
        }

        if (!player.hasEffect(MobEffects.BLINDNESS) &&
                !player.hasEffect(MobEffects.DARKNESS) &&
                fogMode != FogRenderer.FogMode.FOG_SKY &&
                fogtype != FogType.WATER &&
                fogtype != FogType.LAVA &&
                fogtype != FogType.POWDER_SNOW) {
            return Integer.MAX_VALUE;
        }

        return f;
    }
}