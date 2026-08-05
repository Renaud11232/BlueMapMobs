package be.renaud11232.bluemapothermarkers.fabric;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.fabric.module.FabricModule;
import be.renaud11232.bluemapothermarkers.OthersModule;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityTypes;

import java.util.Collection;
import java.util.stream.Stream;

public class FabricOthersModule extends OthersModule<ServerLevel, Entity> implements FabricModule<Entity> {
    protected FabricOthersModule(BlueMapAPI api, Configuration configuration) {
        super(api, configuration, new FabricOtherConverter());
    }

    @Override
    public Collection<? extends Entity> getEntities(ServerLevel world) {
        return Stream.concat(
                world.getEntities(EntityTypes.ARMOR_STAND, e -> !e.isInvisible()).stream(),
                world.getEntities(EntityTypes.MANNEQUIN, e -> !e.isInvisible()).stream()
        ).toList();
    }
}
