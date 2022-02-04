package xyz.starmun.actuallycompatible.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ActuallyCompatibleConfig {
    public static final ForgeConfigSpec.IntValue newPacketBufferSize;
    public static final ForgeConfigSpec.ConfigValue<List<? extends String>> clientIgnoredMods;
    public static final ForgeConfigSpec.ConfigValue<List<? extends String>> serverIgnoredMods;
    public static final ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    static {
        final int defaultPacketBufferSize = 100000;
        builder.push("Buffer");
        newPacketBufferSize = builder.comment("New size of server compatibility packet buffer, in bytes."+System.lineSeparator()+"Default: "+defaultPacketBufferSize)
                .translation("text.actuallycompatible.config.new_packet_buffer_size")
                .defineInRange("newPaketBufferSize",defaultPacketBufferSize,32767, Integer.MAX_VALUE);
        builder.pop();

        builder.push("Ignored Mods");
        clientIgnoredMods = builder.comment("Client-side mod IDs that will be ignored if not present on the server.")
                .defineListAllowEmpty(Collections.singletonList("clientIgnoredMods"), ArrayList::new,
                        s -> s instanceof String && StringUtils.isAsciiPrintable((String) s));
        serverIgnoredMods = builder.comment("Server-side mod IDs that will not be sent to the client.")
                .defineListAllowEmpty(Collections.singletonList("serverIgnoredMods"), ArrayList::new,
                        s -> s instanceof String && StringUtils.isAsciiPrintable((String) s));
        builder.pop();

        SPEC = builder.build();
    }
}
