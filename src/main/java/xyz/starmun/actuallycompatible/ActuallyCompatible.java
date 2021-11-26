package xyz.starmun.actuallycompatible;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xyz.starmun.actuallycompatible.config.ActuallyCompatibleConfig;

@Mod(ActuallyCompatible.MOD_ID)
public class ActuallyCompatible {

    public static final String MOD_ID = "actuallycompatible";
    public static final Logger LOGGER = LogManager.getLogger();
    public ActuallyCompatible(){
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ActuallyCompatibleConfig.SPEC, "actuallycompatible-common.toml");
    }
}
