package be.renaud11232.bluemapmobs.plugin.paper;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.module.configuration.ModuleConfiguration;
import be.renaud11232.bluemapmobs.plugin.common.BukkitCommonMobsModule;

public class PaperMobsModule extends BukkitCommonMobsModule {
    protected PaperMobsModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration) {
        super(api, configuration, new PaperMobConverter());
    }
}
