package be.renaud11232.bluemapvehicles.entities.minecart;

import be.renaud11232.bluemapvehicles.entities.Minecart;

public interface HopperMinecart extends Minecart {
    @Override
    default String getMarkerType() {
        return "hopper_minecart";
    }
}
