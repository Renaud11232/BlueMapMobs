package be.renaud11232.bluemapvehicles.markerbuilder.minecart;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapentities.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapvehicles.VehiclesIcon;
import be.renaud11232.bluemapvehicles.entity.minecart.SpawnerMinecart;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class SpawnerMinecartMarkerBuilder extends SimpleMarkerBuilder<SpawnerMinecart> {
    public SpawnerMinecartMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return VehiclesIcon.SPAWNER_MINECART;
    }
}
