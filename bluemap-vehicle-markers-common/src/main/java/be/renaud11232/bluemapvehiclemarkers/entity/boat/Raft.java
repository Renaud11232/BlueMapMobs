package be.renaud11232.bluemapvehiclemarkers.entity.boat;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapvehiclemarkers.VehicleMarkerType;
import be.renaud11232.bluemapvehiclemarkers.entity.Boat;

public interface Raft extends Boat {
    @Override
    default MarkerType getMarkerType() {
        return VehicleMarkerType.RAFT;
    }
}
