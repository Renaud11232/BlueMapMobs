package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapvehicles.entities.ChestBoat;

public interface PaleOakChestBoat extends ChestBoat {
    @Override
    default String getMarkerType() {
        return "pale_oak_chest_boat";
    }
}
