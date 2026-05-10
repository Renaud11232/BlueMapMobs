package be.renaud11232.bluemapothers.fabric;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.fabric.mod.FabricMod;
import be.renaud11232.bluemapentities.fabric.module.configuration.FabricModuleConfiguration;

public class FabricBlueMapOthers extends FabricMod<FabricModuleConfiguration> {
    public FabricBlueMapOthers() {
        super(FabricModuleConfiguration.class);
    }

    @Override
    public void onInitialize() {
        saveDefaultConfig();
        BlueMapEntitiesAPI.onEnable(api -> {
            getLogger().info("Enabling BlueMapOthers...");
            reloadConfig();
            api.registerModule(new FabricOthersModule(api, getConfig()));
        });
    }
}
