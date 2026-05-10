package be.renaud11232.bluemapothers.fabric;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.module.configuration.ModuleConfiguration;
import be.renaud11232.bluemapothers.OthersModule;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

import java.util.Collection;
import java.util.stream.Stream;

public class FabricOthersModule extends OthersModule<ServerLevel, Entity> {
    protected FabricOthersModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration) {
        super(api, configuration, ServerLevel.class, new FabricOthersConverter());
    }

    @Override
    protected Collection<? extends Entity> getEntities(ServerLevel world) {
        return Stream.concat(
                world.getEntities(EntityType.ARMOR_STAND, e -> !e.isInvisible()).stream(),
                world.getEntities(EntityType.MANNEQUIN, e -> !e.isInvisible()).stream()
        ).toList();
    }
}
