package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.SpawnerMinecart;

public class SpawnerMinecartMarkerBuilder  extends SingleIconVehicleEntityMarkerBuilder<SpawnerMinecart> {
    public SpawnerMinecartMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.vehicles.markers.types.spawner_minecart", Icon.SPAWNER_MINECART);
    }
}
