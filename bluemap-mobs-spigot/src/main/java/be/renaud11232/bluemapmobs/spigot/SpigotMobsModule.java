package be.renaud11232.bluemapmobs.spigot;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapmobs.bukkit.BukkitCommonMobsModule;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class SpigotMobsModule extends BukkitCommonMobsModule {
    protected SpigotMobsModule(BlueMapAPI api, Configuration configuration) {
        super(api, configuration, new SpigotMobConverter());
    }
}
