package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat.chestboat;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.AcaciaChestBoat;

public class AcaciaChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<AcaciaChestBoat> {
    public AcaciaChestBoatMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Vehicle.ACACIA_CHEST_BOAT;
    }
}
