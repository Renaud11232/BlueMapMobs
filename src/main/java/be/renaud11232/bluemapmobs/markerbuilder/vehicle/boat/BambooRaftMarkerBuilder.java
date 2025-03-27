package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.icon.VehicleIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.BambooRaft;

public class BambooRaftMarkerBuilder extends VehicleEntityMarkerBuilder<BambooRaft> {
    public BambooRaftMarkerBuilder(FileConfiguration config) {
        super(config, VehicleIcon.BAMBOO_RAFT);
    }
}
