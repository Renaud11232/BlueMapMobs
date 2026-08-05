package be.renaud11232.bluemapentitymarkers.module;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;

public interface ModuleProvider<WORLD_TYPE, SOURCE_ENTITY_TYPE> {
    Module<WORLD_TYPE, SOURCE_ENTITY_TYPE> provideModule(BlueMapAPI api, Configuration configuration);
}
