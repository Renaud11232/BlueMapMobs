package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapvehicles.entities.Boat;

public interface MangroveBoat extends Boat {
    @Override
    default String getMarkerType() {
        return "mangrove_boat";
    }
}
