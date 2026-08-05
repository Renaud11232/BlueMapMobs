package be.renaud11232.bluemapvehiclemarkers.entity.boat;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapvehiclemarkers.VehicleMarkerType;
import be.renaud11232.bluemapvehiclemarkers.entity.ChestBoat;

public interface ChestRaft extends ChestBoat {
    @Override
    default MarkerType getMarkerType() {
        return VehicleMarkerType.CHEST_RAFT;
    }
}
