package be.renaud11232.bluemapvehicles.markerbuilder.minecart;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapentities.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapvehicles.VehiclesIcon;
import be.renaud11232.bluemapvehicles.entity.minecart.PoweredMinecart;

public class PoweredMinecartMarkerBuilder extends SimpleMarkerBuilder<PoweredMinecart> {
    public PoweredMinecartMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Icon getDefaultIcon() {
        return VehiclesIcon.FURNACE_MINECART;
    }
}
