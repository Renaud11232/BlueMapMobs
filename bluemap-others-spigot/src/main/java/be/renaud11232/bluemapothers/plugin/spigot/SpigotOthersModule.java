package be.renaud11232.bluemapothers.plugin.spigot;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.module.configuration.ModuleConfiguration;
import be.renaud11232.bluemapothers.common.BukkitOthersModule;

public class SpigotOthersModule extends BukkitOthersModule {
    public SpigotOthersModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration) {
        super(api, configuration, new SpigotOthersConverter());
    }
}
