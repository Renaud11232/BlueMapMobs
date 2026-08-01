package be.renaud11232.bluemapmobs.spigot;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.configuration.ModuleConfiguration;
import be.renaud11232.bluemapmobs.bukkit.BukkitCommonMobsModule;

public class SpigotMobsModule extends BukkitCommonMobsModule {
    protected SpigotMobsModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration) {
        super(api, configuration, new SpigotMobConverter());
    }
}
