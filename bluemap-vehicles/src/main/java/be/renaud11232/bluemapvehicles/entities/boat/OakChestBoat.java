package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapvehicles.VehicleMarkerType;
import be.renaud11232.bluemapvehicles.entities.ChestBoat;

public interface OakChestBoat extends ChestBoat {
    @Override
    default MarkerType getMarkerType() {
        return VehicleMarkerType.OAK_CHEST_BOAT;
    }
}
