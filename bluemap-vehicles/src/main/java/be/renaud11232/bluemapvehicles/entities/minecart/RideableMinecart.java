package be.renaud11232.bluemapvehicles.entities.minecart;

import be.renaud11232.bluemapvehicles.entities.Minecart;

public interface RideableMinecart extends Minecart {
    @Override
    default String getMarkerType() {
        return "rideable_minecart";
    }
}
