package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapvehicles.VehicleMarkerType;
import be.renaud11232.bluemapvehicles.entities.Boat;

public interface AcaciaBoat extends Boat {
    @Override
    default MarkerType getMarkerType() {
        return VehicleMarkerType.ACACIA_BOAT;
    }
}
