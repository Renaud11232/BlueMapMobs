package be.renaud11232.bluemapvehicles;

import be.renaud11232.bluemapentities.*;
import be.renaud11232.bluemapvehicles.entities.Vehicle;

public abstract class VehicleModule<T> extends SimpleModule<T, Vehicle> {
    protected VehicleModule(BlueMapEntitiesAPI api, EntityConverter<T, Vehicle> entityConverter) {
        super(api, entityConverter, null, null);//TODO
    }
}
