package be.renaud11232.bluemapvehicles;

import be.renaud11232.bluemapentities.*;
import be.renaud11232.bluemapentities.module.SimpleModule;
import be.renaud11232.bluemapvehicles.entities.Vehicle;

public abstract class VehiclesModule<T> extends SimpleModule<T, Vehicle> {
    protected VehiclesModule(BlueMapEntitiesAPI api, EntityConverter<T, Vehicle> entityConverter) {
        super(api, entityConverter, null, null);//TODO
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
