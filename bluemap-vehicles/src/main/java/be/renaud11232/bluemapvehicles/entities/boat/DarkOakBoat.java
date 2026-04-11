package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapvehicles.entities.Boat;

public interface DarkOakBoat extends Boat {
    @Override
    default String getMarkerType() {
        return "dark_oak_boat";
    }
}
