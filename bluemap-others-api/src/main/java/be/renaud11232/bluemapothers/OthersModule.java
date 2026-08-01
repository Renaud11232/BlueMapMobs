package be.renaud11232.bluemapothers;

import be.renaud11232.bluemapentities.EntityConverter;
import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapentities.module.SimpleModule;
import be.renaud11232.bluemapothers.markerbuilder.OthersMarkerBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;

public abstract class OthersModule<WORLD_TYPE, SOURCE_ENTITY_TYPE> extends SimpleModule<WORLD_TYPE, SOURCE_ENTITY_TYPE, Entity> {
    protected OthersModule(BlueMapAPI api, Configuration configuration, EntityConverter<SOURCE_ENTITY_TYPE, Entity> converter) {
        super(api, configuration, converter, new OthersMarkerBuilder(api, configuration));
    }

    @Override
    public String getModuleIdentifier() {
        return "bluemap-others";
    }
}
