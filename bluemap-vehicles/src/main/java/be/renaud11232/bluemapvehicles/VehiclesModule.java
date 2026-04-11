package be.renaud11232.bluemapvehicles;

import be.renaud11232.bluemapentities.*;
import be.renaud11232.bluemapentities.module.BaseModule;
import be.renaud11232.bluemapentities.module.configuration.ModuleConfiguration;
import be.renaud11232.bluemapvehicles.entities.Vehicle;

public abstract class VehiclesModule<T> extends BaseModule<T, Vehicle> {
    protected VehiclesModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration, EntityConverter<T, Vehicle> entityConverter) {
        super(api, configuration, entityConverter, new VehicleMarkerBuilder());
    }

    @Override
    public String getAssetSourcePath() {
        return "assets";
    }

    @Override
    public String getAssetDirectoryName() {
        return "vehicles";
    }
}
