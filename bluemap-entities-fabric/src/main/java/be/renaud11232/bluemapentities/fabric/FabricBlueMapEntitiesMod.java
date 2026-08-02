package be.renaud11232.bluemapentities.fabric;

import be.renaud11232.bluemapentities.fabric.mod.FabricMod;
import be.renaud11232.bluemapentities.module.Module;
import be.renaud11232.bluemapentities.module.ModuleProvider;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;

import java.util.Optional;

public abstract class FabricBlueMapEntitiesMod<SOURCE_ENTITY_TYPE> extends FabricMod<SOURCE_ENTITY_TYPE> implements ModuleProvider<ServerLevel, SOURCE_ENTITY_TYPE> {
    private static MinecraftServer SERVER;

    private Module<ServerLevel, SOURCE_ENTITY_TYPE> module;
    private int lastUpdateTick = 0;

    public static Optional<MinecraftServer> getServer() {
        return Optional.ofNullable(SERVER);
    }

    @Override
    public void onInitialize() {
        ServerLifecycleEvents.SERVER_STARTING.register(server -> SERVER = server);
        ServerTickEvents.END_SERVER_TICK.register(_ -> {
            if (module != null) {
                if (lastUpdateTick == 0) {
                    module.update();
                }
                if (++lastUpdateTick >= 200) {
                    lastUpdateTick = 0;
                }
            }
        });
        saveDefaultConfig();
        BlueMapAPI.onEnable(api -> {
            getLogger().info("Enabling {}", getName());
            reloadConfig();
            module = provideModule(api, getConfig());
            lastUpdateTick = 0;
        });
    }
}
