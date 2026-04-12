package be.renaud11232.bluemapvehicles.entity.boat;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapvehicles.VehiclesMarkerType;
import be.renaud11232.bluemapvehicles.entity.Boat;

public interface SpruceBoat extends Boat {
    @Override
    default MarkerType getMarkerType() {
        return VehiclesMarkerType.SPRUCE_BOAT;
    }
}
