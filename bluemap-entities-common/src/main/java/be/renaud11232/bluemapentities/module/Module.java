package be.renaud11232.bluemapentities.module;

import be.renaud11232.bluemapentities.entity.Entity;

import java.util.Collection;

public interface Module<WORLD_TYPE, SOURCE_ENTITY_TYPE, TARGET_ENTITY_TYPE extends Entity> {
    String getModuleIdentifier();

    Collection<? extends SOURCE_ENTITY_TYPE> getEntities(WORLD_TYPE world);

    Collection<WORLD_TYPE> getWorlds();

    void update();
}
