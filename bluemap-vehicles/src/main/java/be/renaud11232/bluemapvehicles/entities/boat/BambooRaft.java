package be.renaud11232.bluemapvehicles.entities.boat;

import be.renaud11232.bluemapvehicles.entities.Boat;

public interface BambooRaft extends Boat {
    @Override
    default String getMarkerType() {
        return "bamboo_raft";
    }
}
