package be.renaud11232.bluemapvehicles.entities.minecart;

import be.renaud11232.bluemapvehicles.entities.Minecart;

public interface SpawnerMinecart extends Minecart {
    @Override
    default String getMarkerType() {
        return "spawner_minecart";
    }
}
