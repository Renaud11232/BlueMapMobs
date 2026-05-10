package be.renaud11232.bluemapentities.bukkit;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.Bukkit;

import java.util.Collection;

public class BukkitBlueMapEntitiesAPI extends BlueMapEntitiesAPI {
    public BukkitBlueMapEntitiesAPI(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    public Collection<?> getWorlds() {
        return Bukkit.getWorlds();
    }
}
