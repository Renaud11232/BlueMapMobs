package be.renaud11232.bluemapentitymarkers.module;

import java.util.Collection;

public interface Module<WORLD_TYPE, SOURCE_ENTITY_TYPE> {
    String getModuleIdentifier();

    Collection<? extends SOURCE_ENTITY_TYPE> getEntities(WORLD_TYPE world);

    Collection<WORLD_TYPE> getWorlds();

    void update();
}
