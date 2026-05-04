package be.renaud11232.bluemapentities.bukkit;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.GeneralConfiguration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.Bukkit;

import java.util.Collection;
import java.util.logging.Logger;

public class BukkitBlueMapEntitiesAPI extends BlueMapEntitiesAPI {
    public BukkitBlueMapEntitiesAPI(BlueMapAPI api, GeneralConfiguration configuration, Logger logger) {
        super(api, configuration, logger);
    }

    @Override
    public Collection<?> getWorlds() {
        return Bukkit.getWorlds();
    }
}
