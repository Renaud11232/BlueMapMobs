package be.renaud11232.bluemapothermarkers.paper;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapothermarkers.bukkit.BukkitOthersModule;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class PaperOthersModule extends BukkitOthersModule {
    public PaperOthersModule(BlueMapAPI api, Configuration configuration) {
        super(api, configuration, new PaperOtherConverter());
    }
}
