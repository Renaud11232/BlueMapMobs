package be.renaud11232.bluemapvehicles.entity.minecart;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapvehicles.VehiclesMarkerType;
import be.renaud11232.bluemapvehicles.entity.Minecart;

public interface PoweredMinecart extends Minecart {
    @Override
    default MarkerType getMarkerType() {
        return VehiclesMarkerType.POWERED_MINECART;
    }
}
