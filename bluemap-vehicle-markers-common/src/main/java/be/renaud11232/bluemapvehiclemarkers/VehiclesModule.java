package be.renaud11232.bluemapvehiclemarkers;

import be.renaud11232.bluemapentitymarkers.EntityConverter;
import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.module.SimpleModule;
import be.renaud11232.bluemapvehiclemarkers.entity.Vehicle;
import be.renaud11232.bluemapvehiclemarkers.markerbuilder.VehiclesMarkerBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;

public abstract class VehiclesModule<WORLD_TYPE, SOURCE_ENTITY_TYPE> extends SimpleModule<WORLD_TYPE, SOURCE_ENTITY_TYPE, Vehicle> {
    protected VehiclesModule(BlueMapAPI api, Configuration configuration, EntityConverter<SOURCE_ENTITY_TYPE, Vehicle> converter) {
        super(api, configuration, converter, new VehiclesMarkerBuilder(api, configuration));
    }

    @Override
    public String getModuleIdentifier() {
        return "bluemap-vehicle-markers";
    }
}
