package be.renaud11232.bluemapmobs.paper;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.configuration.ModuleConfiguration;
import be.renaud11232.bluemapmobs.bukkit.BukkitCommonMobsModule;

public class PaperMobsModule extends BukkitCommonMobsModule {
    protected PaperMobsModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration) {
        super(api, configuration, new PaperMobConverter());
    }
}
