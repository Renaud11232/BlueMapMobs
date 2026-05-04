package be.renaud11232.bluemapothers.paper;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.module.configuration.ModuleConfiguration;
import be.renaud11232.bluemapothers.bukkit.BukkitOthersModule;

public class PaperOthersModule extends BukkitOthersModule {
    public PaperOthersModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration) {
        super(api, configuration, new PaperOthersConverter());
    }
}
