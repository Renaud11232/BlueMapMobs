package be.renaud11232.bluemapvehicles.fabric;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.fabric.mod.FabricMod;
import be.renaud11232.bluemapentities.fabric.module.configuration.FabricModuleConfiguration;

public class FabricBlueMapVehicles extends FabricMod<FabricModuleConfiguration> {
    public FabricBlueMapVehicles() {
        super(FabricModuleConfiguration.class);
    }

    @Override
    public void onInitialize() {
        saveDefaultConfig();
        BlueMapEntitiesAPI.onEnable(api -> {
            getLogger().info("Enabling BlueMapVehicles...");
            reloadConfig();
            api.registerModule(new FabricVehiclesModule(api, getConfig()));
        });
    }
}
