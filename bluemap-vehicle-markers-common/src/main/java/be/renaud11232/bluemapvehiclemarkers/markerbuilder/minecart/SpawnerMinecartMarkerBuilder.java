package be.renaud11232.bluemapvehiclemarkers.markerbuilder.minecart;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapentitymarkers.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapvehiclemarkers.VehicleIcon;
import be.renaud11232.bluemapvehiclemarkers.entity.minecart.SpawnerMinecart;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class SpawnerMinecartMarkerBuilder extends SimpleMarkerBuilder<SpawnerMinecart> {
    public SpawnerMinecartMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return VehicleIcon.SPAWNER_MINECART;
    }
}
