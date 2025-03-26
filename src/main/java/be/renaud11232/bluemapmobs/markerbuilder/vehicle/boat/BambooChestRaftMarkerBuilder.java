package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.BambooChestRaft;

public class BambooChestRaftMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<BambooChestRaft> {
    public BambooChestRaftMarkerBuilder(FileConfiguration config) {
        super(config, Icon.BAMBOO_CHEST_RAFT);
    }
}
