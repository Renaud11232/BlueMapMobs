package be.renaud11232.bluemapothers.paper;

import be.renaud11232.bluemapentities.bukkit.BukkitBlueMapEntitiesPlugin;
import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.module.Module;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.World;
import org.bukkit.entity.Entity;

public class PaperBlueMapOthers extends BukkitBlueMapEntitiesPlugin<Entity, be.renaud11232.bluemapentities.entity.Entity> {
    @Override
    public Module<World, Entity, be.renaud11232.bluemapentities.entity.Entity> provideModule(BlueMapAPI api, Configuration configuration) {
        return new PaperOthersModule(api, configuration);
    }
}
