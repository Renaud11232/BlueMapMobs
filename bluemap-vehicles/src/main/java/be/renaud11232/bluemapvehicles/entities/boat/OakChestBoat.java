package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapvehicles.entities.ChestBoat;

public interface OakChestBoat extends ChestBoat {
    @Override
    default String getMarkerType() {
        return "oak_chest_boat";
    }
}
