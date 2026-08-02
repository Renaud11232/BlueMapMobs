package be.renaud11232.bluemapvehicles.entity.boat;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapvehicles.VehiclesMarkerType;
import be.renaud11232.bluemapvehicles.entity.Boat;

public interface RideableBoat extends Boat {
    Type getType();

    @Override
    default MarkerType getMarkerType() {
        return VehiclesMarkerType.RIDEABLE_BOAT;
    }

    enum Type {
        ACACIA,
        BIRCH,
        CHERRY,
        DARK_OAK,
        JUNGLE,
        MANGROVE,
        OAK,
        PALE_OAK,
        SPRUCE
    }
}
