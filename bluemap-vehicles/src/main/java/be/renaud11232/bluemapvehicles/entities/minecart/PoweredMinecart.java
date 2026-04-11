package be.renaud11232.bluemapvehicles.entities.minecart;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapvehicles.VehicleMarkerType;
import be.renaud11232.bluemapvehicles.entities.Minecart;

public interface PoweredMinecart extends Minecart {
    @Override
    default MarkerType getMarkerType() {
        return VehicleMarkerType.POWERED_MINECART;
    }
}
