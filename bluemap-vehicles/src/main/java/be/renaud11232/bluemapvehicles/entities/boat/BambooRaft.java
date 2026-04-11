package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapvehicles.VehiclesMarkerType;
import be.renaud11232.bluemapvehicles.entities.Boat;

public interface BambooRaft extends Boat {
    @Override
    default MarkerType getMarkerType() {
        return VehiclesMarkerType.BAMBOO_RAFT;
    }
}
