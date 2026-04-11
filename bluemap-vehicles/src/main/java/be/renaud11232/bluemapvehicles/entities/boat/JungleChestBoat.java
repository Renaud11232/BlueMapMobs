package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapvehicles.entities.ChestBoat;

public interface JungleChestBoat extends ChestBoat {
    @Override
    default String getMarkerType() {
        return "jungle_chest_boat";
    }
}
