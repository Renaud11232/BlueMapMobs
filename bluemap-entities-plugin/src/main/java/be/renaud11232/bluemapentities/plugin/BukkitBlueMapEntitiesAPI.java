package be.renaud11232.bluemapentities.plugin;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.Bukkit;

import java.util.Collection;

public class BukkitBlueMapEntitiesAPI extends BlueMapEntitiesAPI {
    public BukkitBlueMapEntitiesAPI(BlueMapAPI api) {
        super(api);
    }

    @Override
    public Collection<?> getWorlds() {
        return Bukkit.getWorlds();
    }
}
