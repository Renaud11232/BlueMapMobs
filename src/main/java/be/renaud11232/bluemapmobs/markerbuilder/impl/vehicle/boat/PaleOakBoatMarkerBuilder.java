package be.renaud11232.bluemapmobs.markerbuilder.impl.vehicle.boat;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractVehicleMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.PaleOakBoat;

public class PaleOakBoatMarkerBuilder extends AbstractVehicleMarkerBuilder<PaleOakBoat> {
    public PaleOakBoatMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Vehicle.PALE_OAK_BOAT;
    }
}
