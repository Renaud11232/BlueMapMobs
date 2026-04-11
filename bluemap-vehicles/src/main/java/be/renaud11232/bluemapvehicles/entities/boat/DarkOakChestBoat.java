package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapvehicles.entities.ChestBoat;

public interface DarkOakChestBoat extends ChestBoat {
    @Override
    default String getMarkerType() {
        return "dark_oak_chest_boat";
    }
}
