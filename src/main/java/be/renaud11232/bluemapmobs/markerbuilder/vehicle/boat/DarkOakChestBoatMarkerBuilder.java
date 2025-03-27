package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.DarkOakChestBoat;

public class DarkOakChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<DarkOakChestBoat> {
    public DarkOakChestBoatMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsIcon.Vehicle.DARK_OAK_CHEST_BOAT);
    }
}
