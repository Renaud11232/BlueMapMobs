package be.renaud11232.bluemapentities.module;

import be.renaud11232.bluemapentities.entity.Entity;

import java.util.Collection;

public interface Module<T extends Entity> {
    Collection<T> getEntities(Object world);
    void update(Object world);
    String getAssetDirectoryName();
    String getAssetSourcePath();
}
