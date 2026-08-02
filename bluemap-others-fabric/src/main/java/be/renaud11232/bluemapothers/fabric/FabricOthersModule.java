package be.renaud11232.bluemapothers.fabric;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.fabric.module.FabricModule;
import be.renaud11232.bluemapothers.OthersModule;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityTypes;

import java.util.Collection;
import java.util.stream.Stream;

public class FabricOthersModule extends OthersModule<ServerLevel, Entity> implements FabricModule<Entity> {
    protected FabricOthersModule(BlueMapAPI api, Configuration configuration) {
        super(api, configuration, new FabricOthersConverter());
    }

    @Override
    public Collection<? extends Entity> getEntities(ServerLevel world) {
        return Stream.concat(
                world.getEntities(EntityTypes.ARMOR_STAND, e -> !e.isInvisible()).stream(),
                world.getEntities(EntityTypes.MANNEQUIN, e -> !e.isInvisible()).stream()
        ).toList();
    }
}
