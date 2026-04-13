package be.renaud11232.bluemapothers;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.EntityConverter;
import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapentities.module.SimpleModule;
import be.renaud11232.bluemapentities.module.configuration.ModuleConfiguration;
import be.renaud11232.bluemapothers.markerbuilder.OthersMarkerBuilder;

public abstract class OthersModule<T> extends SimpleModule<T, Entity> {
    protected OthersModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration, EntityConverter<T, Entity> converter) {
        super(api, configuration, converter, new OthersMarkerBuilder(api));
    }

    @Override
    public String getAssetDirectoryName() {
        return "assets";
    }

    @Override
    public String getModuleIdentifier() {
        return "others";
    }
}
