package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.StorageMinecart;

public class StorageMinecartMarkerBuilder extends VehicleEntityMarkerBuilder<StorageMinecart> {
    public StorageMinecartMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Vehicle.CHEST_MINECART;
    }

    @Override
    public BooleanConfiguration getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Vehicles.Markers.Types.STORAGE_MINECART;
    }
}
