package be.renaud11232.bluemapentities.fabric;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.fabric.mod.FabricMod;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.MinecraftServer;

import java.util.Optional;

public class FabricBlueMapEntities extends FabricMod<FabricConfiguration> implements ModInitializer {
    private static MinecraftServer SERVER;

    private BlueMapEntitiesAPI api;
    private int lastUpdateTick = 0;

    public FabricBlueMapEntities() {
        super(FabricConfiguration.class);
    }

    @Override
    public void onInitialize() {
        ServerLifecycleEvents.SERVER_STARTING.register(server -> SERVER = server);
        ServerTickEvents.END_SERVER_TICK.register(_ -> {
            if (api != null) {
                if (lastUpdateTick == 0) {
                    api.update();
                }
                if (++lastUpdateTick >= 200) {
                    lastUpdateTick = 0;
                }
            }
        });
        saveDefaultConfig();
        BlueMapAPI.onEnable(api -> {
            getLogger().info("Enabling BlueMapEntities API...");
            reloadConfig();
            lastUpdateTick = 0;
            this.api = new FabricBlueMapEntitiesAPI(
                    api,
                    getConfig()
            );
            BlueMapEntitiesAPI.enable(this.api);
        });
        BlueMapAPI.onDisable(_ -> {
            getLogger().info("Disabling BlueMapEntities API...");
            BlueMapEntitiesAPI.disable(this.api);
            this.api = null;
        });
    }

    public static Optional<MinecraftServer> getServer() {
        return Optional.ofNullable(SERVER);
    }
}
