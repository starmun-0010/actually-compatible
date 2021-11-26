package xyz.starmun.actuallycompatible.mixin;

import net.minecraft.network.FriendlyByteBuf;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import xyz.starmun.actuallycompatible.config.ActuallyCompatibleConfig;

/*
Increases buffer for multiplayer server list
 */
@Mixin(FriendlyByteBuf.class)
public class PacketBufferEncoderMixin {
	@ModifyConstant(method = "writeUtf(Ljava/lang/String;)Lnet/minecraft/network/FriendlyByteBuf;",constant = @Constant(intValue = 32767))
	private int  getMaxEncodePacketSize(int old) {
		return ActuallyCompatibleConfig.newPacketBufferSize.get();
	}
}
