package be.renaud11232.bluemapothermarkers;

import be.renaud11232.bluemapentitymarkers.EntityConverter;
import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.entity.Entity;
import be.renaud11232.bluemapentitymarkers.module.SimpleModule;
import be.renaud11232.bluemapothermarkers.markerbuilder.OthersMarkerBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;

public abstract class OthersModule<WORLD_TYPE, SOURCE_ENTITY_TYPE> extends SimpleModule<WORLD_TYPE, SOURCE_ENTITY_TYPE, Entity> {
    protected OthersModule(BlueMapAPI api, Configuration configuration, EntityConverter<SOURCE_ENTITY_TYPE, Entity> converter) {
        super(api, configuration, converter, new OthersMarkerBuilder(api, configuration));
    }

    @Override
    public String getModuleIdentifier() {
        return "bluemap-other-markers";
    }
}
