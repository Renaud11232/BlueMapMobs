package be.renaud11232.bluemapvehiclemarkers.entity.boat;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapvehiclemarkers.VehicleMarkerType;
import be.renaud11232.bluemapvehiclemarkers.entity.Boat;

public interface RideableBoat extends Boat {
    Type getType();

    @Override
    default MarkerType getMarkerType() {
        return VehicleMarkerType.RIDEABLE_BOAT;
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
