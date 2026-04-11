package be.renaud11232.bluemapvehicles.markerbuilder.boat;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapentities.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapvehicles.VehiclesIcon;
import be.renaud11232.bluemapvehicles.entities.boat.JungleChestBoat;

public class JungleChestBoatMarkerBuilder extends SimpleMarkerBuilder<JungleChestBoat> {
    public JungleChestBoatMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    public Icon getDefaultIcon() {
        return VehiclesIcon.JUNGLE_CHEST_BOAT;
    }
}
