package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapvehicles.VehicleMarkerType;
import be.renaud11232.bluemapvehicles.entities.ChestBoat;

public interface JungleChestBoat extends ChestBoat {
    @Override
    default MarkerType getMarkerType() {
        return VehicleMarkerType.JUNGLE_CHEST_BOAT;
    }
}
