package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapvehicles.entities.Boat;

public interface CherryBoat extends Boat {
    @Override
    default String getMarkerType() {
        return "cherry_boat";
    }
}
