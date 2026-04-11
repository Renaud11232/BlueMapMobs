package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapvehicles.entities.ChestBoat;

public interface AcaciaChestBoat extends ChestBoat {
    @Override
    default String getMarkerType() {
        return "acacia_chest_boat";
    }
}
