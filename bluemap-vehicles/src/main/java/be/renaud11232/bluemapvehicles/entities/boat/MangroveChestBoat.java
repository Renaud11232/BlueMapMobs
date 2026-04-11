package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapvehicles.entities.ChestBoat;

public interface MangroveChestBoat extends ChestBoat {
    @Override
    default String getMarkerType() {
        return "mangrove_chest_boat";
    }
}
