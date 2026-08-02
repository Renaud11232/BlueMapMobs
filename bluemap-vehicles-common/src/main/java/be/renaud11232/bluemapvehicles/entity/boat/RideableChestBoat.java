package be.renaud11232.bluemapvehicles.entity.boat;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapvehicles.VehiclesMarkerType;
import be.renaud11232.bluemapvehicles.entity.ChestBoat;

public interface RideableChestBoat extends ChestBoat {
    RideableBoat.Type getType();

    @Override
    default MarkerType getMarkerType() {
        return VehiclesMarkerType.RIDEABLE_CHEST_BOAT;
    }
}
