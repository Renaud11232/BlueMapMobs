package be.renaud11232.bluemapmobmarkers.spigot;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.bukkit.BukkitCommonMobsModule;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class SpigotMobsModule extends BukkitCommonMobsModule {
    protected SpigotMobsModule(BlueMapAPI api, Configuration configuration) {
        super(api, configuration, new SpigotMobConverter());
    }
}
