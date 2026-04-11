package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapvehicles.entities.Boat;

public interface OakBoat extends Boat {
    @Override
    default String getMarkerType() {
        return "oak_boat";
    }
}
