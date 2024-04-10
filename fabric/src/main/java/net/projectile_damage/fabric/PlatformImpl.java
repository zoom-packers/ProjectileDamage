package net.projectile_damage.fabric;

import net.fabricmc.loader.api.FabricLoader;
import net.projectile_damage.Platform;

import static net.projectile_damage.Platform.Type.FABRIC;

public class PlatformImpl {
    public static Platform.Type getPlatformType() {
        return FABRIC;
    }

    public static boolean isModLoaded(String modid) {
        return FabricLoader.getInstance().isModLoaded(modid);
    }
}
