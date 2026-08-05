package be.renaud11232.bluemapothermarkers.spigot;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapothermarkers.bukkit.BukkitOthersModule;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class SpigotOthersModule extends BukkitOthersModule {
    public SpigotOthersModule(BlueMapAPI api, Configuration configuration) {
        super(api, configuration, new SpigotOtherConverter());
    }
}
