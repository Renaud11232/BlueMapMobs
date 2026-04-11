package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapvehicles.entities.Boat;

public interface SpruceBoat extends Boat {
    @Override
    default String getMarkerType() {
        return "spruce_boat";
    }
}
