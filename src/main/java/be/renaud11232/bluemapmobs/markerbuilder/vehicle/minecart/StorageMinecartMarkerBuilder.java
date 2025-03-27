package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.icon.VehicleIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.StorageMinecart;

public class StorageMinecartMarkerBuilder extends VehicleEntityMarkerBuilder<StorageMinecart> {
    public StorageMinecartMarkerBuilder(FileConfiguration config) {
        super(config, Configuration.MarkerSets.Vehicles.Markers.Types.STORAGE_MINECART, VehicleIcon.CHEST_MINECART);
    }
}
