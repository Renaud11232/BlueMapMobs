package be.renaud11232.bluemapvehicles.entities.minecart;

import be.renaud11232.bluemapvehicles.entities.Minecart;

public interface PoweredMinecart extends Minecart {
    @Override
    default String getMarkerType() {
        return "powered_minecart";
    }
}
