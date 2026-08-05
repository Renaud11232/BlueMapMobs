package be.renaud11232.bluemapothermarkers.spigot;

import be.renaud11232.bluemapentitymarkers.bukkit.BukkitBlueMapEntityMarkersPlugin;
import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.module.Module;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.World;
import org.bukkit.entity.Entity;

public class SpigotBlueMapOtherMarkersPlugin extends BukkitBlueMapEntityMarkersPlugin<Entity> {
    @Override
    public Module<World, Entity> provideModule(BlueMapAPI api, Configuration configuration) {
        return new SpigotOthersModule(api, configuration);
    }
}
