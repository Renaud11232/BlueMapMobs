package be.renaud11232.bluemapvehiclemarkers.entity.minecart;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapvehiclemarkers.VehicleMarkerType;
import be.renaud11232.bluemapvehiclemarkers.entity.Minecart;

public interface RideableMinecart extends Minecart {
    @Override
    default MarkerType getMarkerType() {
        return VehicleMarkerType.RIDEABLE_MINECART;
    }
}
