package be.renaud11232.bluemapvehiclemarkers.markerbuilder.boat;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapentitymarkers.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapvehiclemarkers.VehicleIcon;
import be.renaud11232.bluemapvehiclemarkers.entity.boat.ChestRaft;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class ChestRaftMarkerBuilder extends SimpleMarkerBuilder<ChestRaft> {
    public ChestRaftMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return VehicleIcon.CHEST_RAFT;
    }
}
