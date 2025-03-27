package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.BambooChestRaft;

public class BambooChestRaftMarkerBuilder extends VehicleEntityMarkerBuilder<BambooChestRaft> {
    public BambooChestRaftMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsIcon.Vehicle.BAMBOO_CHEST_RAFT);
    }
}
