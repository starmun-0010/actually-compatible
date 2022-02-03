package xyz.starmun.actuallycompatible.mixin;

import net.minecraftforge.fml.ExtensionPoint;
import net.minecraftforge.fml.ModContainer;
import org.apache.commons.lang3.tuple.Pair;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xyz.starmun.actuallycompatible.config.ActuallyCompatibleConfig;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

@Mixin(value = ModContainer.class, remap = false)
abstract class ModContainerMixin {

    @Final
    @Shadow
    protected String modId;

    @Final
    @Shadow
    protected Map<ExtensionPoint, Supplier<?>> extensionPoints;

    @SuppressWarnings("unchecked")
    @Inject(method = "getCustomExtension",at = @At("HEAD"), cancellable = true)
    public <T> void getCustomExtension(ExtensionPoint<T> point, CallbackInfoReturnable<Optional<T>> callback) {
        if (ExtensionPoint.DISPLAYTEST.equals(point) && ActuallyCompatibleConfig.clientIgnoredMods.get().contains(modId)) {
            // mark mod as compatible even when not present on the server
            callback.setReturnValue(Optional.of((T)Pair.<Supplier<String>, BiPredicate<String, Boolean>>of(() -> "", (a, b) -> true)));
        }
    }
}
