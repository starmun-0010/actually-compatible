package xyz.starmun.actuallycompatible.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ActuallyCompatibleConfig {
    public static final ForgeConfigSpec.IntValue newPacketBufferSize;
    public static final ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    static {
        final int defaultPacketBufferSize = 100000;
        builder.push("Buffer");
        newPacketBufferSize = builder.comment("New size of server compatibility packet buffer, in bytes."+System.lineSeparator()+"Default: "+defaultPacketBufferSize)
                .translation("text.actuallycompatible.config.new_packet_buffer_size")
                .defineInRange("newPaketBufferSize",defaultPacketBufferSize,32767, Integer.MAX_VALUE);
        builder.pop();
        SPEC = builder.build();
    }
}
