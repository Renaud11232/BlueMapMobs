package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.PaleOakChestBoat;

public class PaleOakChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<PaleOakChestBoat> {
    public PaleOakChestBoatMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsIcon.Vehicle.PALE_OAK_CHEST_BOAT);
    }
}
