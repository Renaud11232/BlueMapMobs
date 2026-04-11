package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapvehicles.entities.Boat;

public interface PaleOakBoat extends Boat {
    @Override
    default String getMarkerType() {
        return "pale_oak_boat";
    }
}
