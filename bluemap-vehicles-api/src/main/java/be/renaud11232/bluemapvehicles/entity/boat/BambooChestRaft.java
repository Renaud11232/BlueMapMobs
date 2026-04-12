package be.renaud11232.bluemapvehicles.entity.boat;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapvehicles.VehiclesMarkerType;
import be.renaud11232.bluemapvehicles.entity.ChestBoat;

public interface BambooChestRaft extends ChestBoat {
    @Override
    default MarkerType getMarkerType() {
        return VehiclesMarkerType.BAMBOO_CHEST_RAFT;
    }
}
