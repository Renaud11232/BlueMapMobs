package be.renaud11232.bluemapothers.spigot;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapothers.bukkit.BukkitOthersModule;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class SpigotOthersModule extends BukkitOthersModule {
    public SpigotOthersModule(BlueMapAPI api, Configuration configuration) {
        super(api, configuration, new SpigotOthersConverter());
    }
}
