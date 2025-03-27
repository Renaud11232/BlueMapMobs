package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.icon.VehicleIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.SpawnerMinecart;

public class SpawnerMinecartMarkerBuilder  extends VehicleEntityMarkerBuilder<SpawnerMinecart> {
    public SpawnerMinecartMarkerBuilder(FileConfiguration config) {
        super(config, Configuration.MarkerSets.Vehicles.Markers.Types.SPAWNER_MINECART, VehicleIcon.SPAWNER_MINECART);
    }
}
