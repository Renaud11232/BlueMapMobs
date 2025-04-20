package be.renaud11232.bluemapmobs.markerbuilder.impl.vehicle.boat.chestboat;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractVehicleMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.BambooChestRaft;

public class BambooChestRaftMarkerBuilder extends AbstractVehicleMarkerBuilder<BambooChestRaft> {
    public BambooChestRaftMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Vehicle.BAMBOO_CHEST_RAFT;
    }
}
