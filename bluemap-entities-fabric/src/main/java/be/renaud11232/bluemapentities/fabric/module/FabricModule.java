package be.renaud11232.bluemapentities.fabric.module;

import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapentities.fabric.FabricBlueMapEntitiesMod;
import be.renaud11232.bluemapentities.module.Module;
import net.minecraft.server.level.ServerLevel;

import java.util.Collection;
import java.util.List;
import java.util.stream.StreamSupport;

public interface FabricModule<SOURCE_ENTITY_TYPE, TARGET_ENTITY_TYPE extends Entity> extends Module<ServerLevel, SOURCE_ENTITY_TYPE, TARGET_ENTITY_TYPE> {
    @Override
    default Collection<ServerLevel> getWorlds() {
        return FabricBlueMapEntitiesMod.getServer()
                .map(s -> StreamSupport.stream(s.getAllLevels().spliterator(), false).toList())
                .orElseGet(List::of);
    }
}
