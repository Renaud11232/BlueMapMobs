package be.renaud11232.bluemapvehiclemarkers.markerbuilder.minecart;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapentitymarkers.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapvehiclemarkers.VehicleIcon;
import be.renaud11232.bluemapvehiclemarkers.entity.minecart.HopperMinecart;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class HopperMinecartMarkerBuilder extends SimpleMarkerBuilder<HopperMinecart> {
    public HopperMinecartMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return VehicleIcon.HOPPER_MINECART;
    }
}
