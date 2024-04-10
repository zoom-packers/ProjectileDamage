package net.projectile_damage.forge;

import net.minecraftforge.fml.ModList;
import net.projectile_damage.Platform;

import static net.projectile_damage.Platform.Type.FORGE;

public class PlatformImpl {
    public static Platform.Type getPlatformType() {
        return FORGE;
    }

    public static boolean isModLoaded(String modid) {
        return ModList.get().isLoaded(modid);
    }
}
