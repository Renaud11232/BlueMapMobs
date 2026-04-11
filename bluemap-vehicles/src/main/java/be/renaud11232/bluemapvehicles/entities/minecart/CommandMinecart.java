package be.renaud11232.bluemapvehicles.entities.minecart;

import be.renaud11232.bluemapvehicles.entities.Minecart;

public interface CommandMinecart extends Minecart {
    @Override
    default String getMarkerType() {
        return "command_minecart";
    }
}
