package be.renaud11232.bluemapmobmarkers.paper;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.bukkit.BukkitCommonMobsModule;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class PaperMobsModule extends BukkitCommonMobsModule {
    protected PaperMobsModule(BlueMapAPI api, Configuration configuration) {
        super(api, configuration, new PaperMobConverter());
    }
}
