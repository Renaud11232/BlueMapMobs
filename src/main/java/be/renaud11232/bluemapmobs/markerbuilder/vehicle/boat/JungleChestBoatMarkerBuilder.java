package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.JungleChestBoat;

public class JungleChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<JungleChestBoat> {
    public JungleChestBoatMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsIcon.Vehicle.JUNGLE_CHEST_BOAT);
    }
}
