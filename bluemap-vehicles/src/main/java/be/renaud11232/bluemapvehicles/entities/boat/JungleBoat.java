package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapvehicles.entities.Boat;

public interface JungleBoat extends Boat {
    @Override
    default String getMarkerType() {
        return "jungle_boat";
    }
}
