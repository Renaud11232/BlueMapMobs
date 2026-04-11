package be.renaud11232.bluemapvehicles.markerbuilder.minecart;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapentities.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapvehicles.VehiclesIcon;
import be.renaud11232.bluemapvehicles.entities.minecart.ExplosiveMinecart;

public class ExplosiveMinecartMarkerBuilder extends SimpleMarkerBuilder<ExplosiveMinecart> {
    public ExplosiveMinecartMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Icon getDefaultIcon() {
        return VehiclesIcon.TNT_MINECART;
    }
}
