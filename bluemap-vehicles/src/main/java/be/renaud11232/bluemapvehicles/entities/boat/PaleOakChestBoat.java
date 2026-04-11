package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapvehicles.VehiclesMarkerType;
import be.renaud11232.bluemapvehicles.entities.ChestBoat;

public interface PaleOakChestBoat extends ChestBoat {
    @Override
    default MarkerType getMarkerType() {
        return VehiclesMarkerType.PALE_OAK_CHEST_BOAT;
    }
}
