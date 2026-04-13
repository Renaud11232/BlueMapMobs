package be.renaud11232.bluemapvehicles;

import be.renaud11232.bluemapentities.*;
import be.renaud11232.bluemapentities.module.SimpleModule;
import be.renaud11232.bluemapentities.module.configuration.ModuleConfiguration;
import be.renaud11232.bluemapvehicles.entity.Vehicle;
import be.renaud11232.bluemapvehicles.markerbuilder.VehiclesMarkerBuilder;

public abstract class VehiclesModule<T> extends SimpleModule<T, Vehicle> {
    protected VehiclesModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration, EntityConverter<T, Vehicle> entityConverter) {
        super(api, configuration, entityConverter, new VehiclesMarkerBuilder(api));
    }

    @Override
    public String getModuleIdentifier() {
        return "vehicles";
    }

    @Override
    public String getAssetDirectoryName() {
        return "assets";
    }
}
