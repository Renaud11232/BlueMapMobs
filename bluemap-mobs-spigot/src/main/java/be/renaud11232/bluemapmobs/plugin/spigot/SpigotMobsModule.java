package be.renaud11232.bluemapmobs.plugin.spigot;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.module.configuration.ModuleConfiguration;
import be.renaud11232.bluemapmobs.plugin.common.BukkitCommonMobsModule;

public class SpigotMobsModule extends BukkitCommonMobsModule {
    protected SpigotMobsModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration) {
        super(api, configuration, new SpigotMobConverter());
    }
}
