package be.renaud11232.bluemapentities.fabric.module;

import be.renaud11232.bluemapentities.fabric.FabricBlueMapEntities;
import be.renaud11232.bluemapentities.module.Module;
import net.minecraft.server.level.ServerLevel;

import java.util.Collection;
import java.util.List;
import java.util.stream.StreamSupport;

public interface FabricModule<SOURCE_ENTITY_TYPE> extends Module<ServerLevel, SOURCE_ENTITY_TYPE> {
    @Override
    default Collection<ServerLevel> getWorlds() {
        return FabricBlueMapEntities.getServer()
                .map(s -> StreamSupport.stream(s.getAllLevels().spliterator(), false).toList())
                .orElseGet(List::of);
    }
}
