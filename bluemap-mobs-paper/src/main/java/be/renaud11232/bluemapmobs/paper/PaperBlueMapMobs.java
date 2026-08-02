package be.renaud11232.bluemapmobs.paper;

import be.renaud11232.bluemapentities.bukkit.BukkitBlueMapEntitiesPlugin;
import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.module.Module;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.World;
import org.bukkit.entity.Mob;

public class PaperBlueMapMobs extends BukkitBlueMapEntitiesPlugin<Mob> {
    @Override
    public Module<World, Mob> provideModule(BlueMapAPI api, Configuration configuration) {
        return new PaperMobsModule(api, configuration);
    }
}
