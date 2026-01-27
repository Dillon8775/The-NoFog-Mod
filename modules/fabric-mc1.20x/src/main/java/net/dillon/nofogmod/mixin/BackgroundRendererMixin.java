package net.dillon.nofogmod.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.BackgroundRenderer;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Environment(EnvType.CLIENT)
@Mixin(BackgroundRenderer.class)
public class BackgroundRendererMixin {

	@Redirect(method = "applyFog", at = @At(value = "FIELD", target = "Lnet/minecraft/client/render/BackgroundRenderer$FogData;fogEnd:F", ordinal = 9, opcode = Opcodes.PUTFIELD))
	private static void modifyEndValue(BackgroundRenderer.FogData fogData, float original) {
		fogData.fogEnd = Integer.MAX_VALUE;
	}

	@Redirect(method = "applyFog", at = @At(value = "FIELD", target = "Lnet/minecraft/client/render/BackgroundRenderer$FogData;fogEnd:F", ordinal = 11, opcode = Opcodes.PUTFIELD))
	private static void modifyEndingValue(BackgroundRenderer.FogData fogData, float original) {
		fogData.fogEnd = Integer.MAX_VALUE;
	}
}