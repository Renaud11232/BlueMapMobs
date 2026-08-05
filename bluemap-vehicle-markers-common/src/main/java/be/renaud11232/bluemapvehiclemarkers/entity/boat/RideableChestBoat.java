package be.renaud11232.bluemapvehiclemarkers.entity.boat;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapvehiclemarkers.VehicleMarkerType;
import be.renaud11232.bluemapvehiclemarkers.entity.ChestBoat;

public interface RideableChestBoat extends ChestBoat {
    RideableBoat.Type getType();

    @Override
    default MarkerType getMarkerType() {
        return VehicleMarkerType.RIDEABLE_CHEST_BOAT;
    }
}
