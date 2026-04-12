package be.renaud11232.bluemapvehicles.markerbuilder.minecart;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapentities.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapvehicles.VehiclesIcon;
import be.renaud11232.bluemapvehicles.entity.minecart.SpawnerMinecart;

public class SpawnerMinecartMarkerBuilder extends SimpleMarkerBuilder<SpawnerMinecart> {
    public SpawnerMinecartMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Icon getDefaultIcon() {
        return VehiclesIcon.SPAWNER_MINECART;
    }
}
