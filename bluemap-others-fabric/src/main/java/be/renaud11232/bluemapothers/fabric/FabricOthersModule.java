package be.renaud11232.bluemapothers.fabric;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.module.configuration.ModuleConfiguration;
import be.renaud11232.bluemapothers.OthersModule;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.decoration.Mannequin;

import java.util.Collection;
import java.util.stream.StreamSupport;

public class FabricOthersModule extends OthersModule<Entity> {
    protected FabricOthersModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration) {
        super(api, configuration, new FabricOthersConverter());
    }

    @Override
    protected Collection<? extends Entity> getEntities(Object world) {
        return StreamSupport.stream(((ServerLevel) world).getAllEntities().spliterator(), false)
                .filter(entity -> !entity.isInvisible() && (entity instanceof ArmorStand || entity instanceof Mannequin))
                .toList();
    }
}
