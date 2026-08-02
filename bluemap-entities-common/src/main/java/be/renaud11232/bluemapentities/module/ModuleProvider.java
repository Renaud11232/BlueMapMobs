package be.renaud11232.bluemapentities.module;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.entity.Entity;
import de.bluecolored.bluemap.api.BlueMapAPI;

public interface ModuleProvider<WORLD_TYPE, SOURCE_ENTITY_TYPE> {
    Module<WORLD_TYPE, SOURCE_ENTITY_TYPE> provideModule(BlueMapAPI api, Configuration configuration);
}
