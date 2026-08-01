package be.renaud11232.bluemapothers.paper;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapothers.bukkit.BukkitOthersModule;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class PaperOthersModule extends BukkitOthersModule {
    public PaperOthersModule(BlueMapAPI api, Configuration configuration) {
        super(api, configuration, new PaperOthersConverter());
    }
}
