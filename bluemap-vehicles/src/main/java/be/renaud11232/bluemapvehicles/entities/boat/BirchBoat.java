package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapvehicles.entities.Boat;

public interface BirchBoat extends Boat {
    @Override
    default String getMarkerType() {
        return "birch_boat";
    }
}
