package be.renaud11232.bluemapvehicles.markerbuilder.boat;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapentities.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapvehicles.VehiclesIcon;
import be.renaud11232.bluemapvehicles.entities.boat.PaleOakChestBoat;

public class PaleOakChestBoatMarkerBuilder extends SimpleMarkerBuilder<PaleOakChestBoat> {
    public PaleOakChestBoatMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    public Icon getDefaultIcon() {
        return VehiclesIcon.PALE_OAK_CHEST_BOAT;
    }
}
