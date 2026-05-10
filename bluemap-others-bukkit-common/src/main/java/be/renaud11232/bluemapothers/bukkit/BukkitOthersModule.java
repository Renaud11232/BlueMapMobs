package be.renaud11232.bluemapothers.bukkit;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.EntityConverter;
import be.renaud11232.bluemapentities.module.configuration.ModuleConfiguration;
import be.renaud11232.bluemapothers.OthersModule;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mannequin;

import java.util.Collection;

public abstract class BukkitOthersModule extends OthersModule<World, Entity> {
    protected BukkitOthersModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration, EntityConverter<Entity, be.renaud11232.bluemapentities.entity.Entity> converter) {
        super(api, configuration, World.class, converter);
    }

    @Override
    protected Collection<? extends Entity> getEntities(World world) {
        return world.getEntitiesByClasses(ArmorStand.class, Mannequin.class)
                .stream()
                .filter(entity -> {
                    if (entity instanceof LivingEntity livingEntity) {
                        return !livingEntity.isInvisible();
                    }
                    return true;
                })
                .toList();
    }
}
