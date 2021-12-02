package xyz.starmun.actuallycompatible.mixin;

import net.minecraft.network.protocol.status.ClientboundStatusResponsePacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import xyz.starmun.actuallycompatible.config.ActuallyCompatibleConfig;

/*
Increases buffer for multiplayer server list
 */
@Mixin(ClientboundStatusResponsePacket.class)
public class PacketBufferDecoderMixin {
	@ModifyConstant(method = "<init>(Lnet/minecraft/network/FriendlyByteBuf;)V", constant = @Constant(intValue = 32767))
	private int getMaxDecodePacketSize(int old) {
		return ActuallyCompatibleConfig.newPacketBufferSize.get();
	}
}
