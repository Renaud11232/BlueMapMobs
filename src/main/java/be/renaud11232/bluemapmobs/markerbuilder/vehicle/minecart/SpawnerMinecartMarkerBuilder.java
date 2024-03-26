package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.SpawnerMinecart;

import java.util.Optional;

public class SpawnerMinecartMarkerBuilder  extends VehicleEntityMarkerBuilder<SpawnerMinecart> {

    public SpawnerMinecartMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(SpawnerMinecart spawnerMinecart) {
        return super.buildDefault(spawnerMinecart).map(marker -> {
            marker.setIcon(Icon.SPAWNER_MINECART.getPath(), Icon.SPAWNER_MINECART.getAnchor());
            return marker;
        });
    }

}
