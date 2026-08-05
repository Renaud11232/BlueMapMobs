package be.renaud11232.bluemapmobmarkers.bukkit;

import be.renaud11232.bluemapentitymarkers.EntityConverter;
import be.renaud11232.bluemapentitymarkers.bukkit.module.BukkitModule;
import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobsModule;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.World;
import org.bukkit.entity.Mob;

import java.util.Collection;

public abstract class BukkitCommonMobsModule extends MobsModule<World, Mob> implements BukkitModule<Mob> {
    protected BukkitCommonMobsModule(BlueMapAPI api, Configuration configuration, EntityConverter<Mob, be.renaud11232.bluemapmobmarkers.entity.Mob> converter) {
        super(api, configuration, converter);
    }

    @Override
    public Collection<? extends Mob> getEntities(World world) {
        return world.getEntitiesByClass(Mob.class);
    }
}
