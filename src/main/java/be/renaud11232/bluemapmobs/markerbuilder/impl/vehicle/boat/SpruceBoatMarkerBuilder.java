package be.renaud11232.bluemapmobs.markerbuilder.impl.vehicle.boat;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractVehicleMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.SpruceBoat;

public class SpruceBoatMarkerBuilder extends AbstractVehicleMarkerBuilder<SpruceBoat> {
    public SpruceBoatMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Vehicle.SPRUCE_BOAT;
    }
}
