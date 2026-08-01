package be.renaud11232.bluemapmobs.spigot;

import be.renaud11232.bluemapentities.bukkit.BukkitBlueMapEntitiesPlugin;
import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.module.Module;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.World;
import org.bukkit.entity.Mob;

public class SpigotBlueMapMobs extends BukkitBlueMapEntitiesPlugin<Mob, be.renaud11232.bluemapmobs.entity.Mob> {
    @Override
    public Module<World, Mob, be.renaud11232.bluemapmobs.entity.Mob> provideModule(BlueMapAPI api, Configuration configuration) {
        return new SpigotMobsModule(api, configuration);
    }
}
