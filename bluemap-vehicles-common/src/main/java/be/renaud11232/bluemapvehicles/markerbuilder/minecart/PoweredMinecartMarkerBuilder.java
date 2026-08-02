package be.renaud11232.bluemapvehicles.markerbuilder.minecart;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapentities.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapvehicles.VehiclesIcon;
import be.renaud11232.bluemapvehicles.entity.minecart.PoweredMinecart;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class PoweredMinecartMarkerBuilder extends SimpleMarkerBuilder<PoweredMinecart> {
    public PoweredMinecartMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return VehiclesIcon.FURNACE_MINECART;
    }
}
