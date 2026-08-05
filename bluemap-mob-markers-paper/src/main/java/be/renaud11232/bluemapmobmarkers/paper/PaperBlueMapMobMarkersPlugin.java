package be.renaud11232.bluemapmobmarkers.paper;

import be.renaud11232.bluemapentitymarkers.bukkit.BukkitBlueMapEntityMarkersPlugin;
import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.module.Module;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.World;
import org.bukkit.entity.Mob;

public class PaperBlueMapMobMarkersPlugin extends BukkitBlueMapEntityMarkersPlugin<Mob> {
    @Override
    public Module<World, Mob> provideModule(BlueMapAPI api, Configuration configuration) {
        return new PaperMobsModule(api, configuration);
    }
}
