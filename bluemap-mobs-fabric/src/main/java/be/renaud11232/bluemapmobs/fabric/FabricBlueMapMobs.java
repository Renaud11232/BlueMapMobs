package be.renaud11232.bluemapmobs.fabric;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.fabric.mod.FabricMod;
import be.renaud11232.bluemapentities.fabric.module.configuration.FabricModuleConfiguration;

public class FabricBlueMapMobs extends FabricMod<FabricModuleConfiguration> {
    public FabricBlueMapMobs() {
        super(FabricModuleConfiguration.class);
    }

    @Override
    public void onInitialize() {
        saveDefaultConfig();
        BlueMapEntitiesAPI.onEnable(api -> {
            getLogger().info("Enabling BlueMapMobs...");
            reloadConfig();
            api.registerModule(new FabricMobsModule(api, getConfig()));
        });
    }
}
