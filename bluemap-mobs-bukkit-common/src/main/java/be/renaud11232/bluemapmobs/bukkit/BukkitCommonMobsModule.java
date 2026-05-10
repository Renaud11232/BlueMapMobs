package be.renaud11232.bluemapmobs.bukkit;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.EntityConverter;
import be.renaud11232.bluemapentities.module.configuration.ModuleConfiguration;
import be.renaud11232.bluemapmobs.MobsModule;
import org.bukkit.World;
import org.bukkit.entity.Mob;

import java.util.Collection;

public abstract class BukkitCommonMobsModule extends MobsModule<World, Mob> {
    protected BukkitCommonMobsModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration, EntityConverter<Mob, be.renaud11232.bluemapmobs.entity.Mob> converter) {
        super(api, configuration, World.class, converter);
    }

    @Override
    protected Collection<? extends Mob> getEntities(World world) {
        return world.getEntitiesByClass(Mob.class);
    }
}
