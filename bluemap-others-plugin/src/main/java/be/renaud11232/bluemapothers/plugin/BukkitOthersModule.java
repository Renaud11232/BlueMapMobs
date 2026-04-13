package be.renaud11232.bluemapothers.plugin;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.module.configuration.ModuleConfiguration;
import be.renaud11232.bluemapothers.OthersModule;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mannequin;

import java.util.Collection;

public class BukkitOthersModule extends OthersModule<Entity> {
    protected BukkitOthersModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration) {
        super(api, configuration, new BukkitOthersConverter());
    }

    @Override
    protected Collection<? extends Entity> getEntities(Object world) {
        return ((World) world).getEntitiesByClasses(ArmorStand.class, Mannequin.class)
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
