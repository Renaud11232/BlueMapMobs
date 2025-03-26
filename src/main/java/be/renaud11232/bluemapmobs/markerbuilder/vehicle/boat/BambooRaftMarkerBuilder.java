package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.BambooRaft;

public class BambooRaftMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<BambooRaft> {
    public BambooRaftMarkerBuilder(FileConfiguration config) {
        super(config, Icon.BAMBOO_RAFT);
    }
}
