package be.renaud11232.bluemapmobs.paper;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapmobs.bukkit.BukkitCommonMobsModule;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class PaperMobsModule extends BukkitCommonMobsModule {
    protected PaperMobsModule(BlueMapAPI api, Configuration configuration) {
        super(api, configuration, new PaperMobConverter());
    }
}
