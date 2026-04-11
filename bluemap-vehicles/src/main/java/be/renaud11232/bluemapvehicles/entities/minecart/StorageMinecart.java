package be.renaud11232.bluemapvehicles.entities.minecart;

import be.renaud11232.bluemapvehicles.entities.Minecart;

public interface StorageMinecart extends Minecart {
    @Override
    default String getMarkerType() {
        return "storage_minecart";
    }
}
