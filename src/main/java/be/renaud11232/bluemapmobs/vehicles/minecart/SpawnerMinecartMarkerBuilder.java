package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.vehicles.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.minecart.SpawnerMinecart;

import java.util.Optional;

public class SpawnerMinecartMarkerBuilder implements VehicleEntityMarkerBuilder<SpawnerMinecart> {

    @Override
    public Optional<POIMarker> build(SpawnerMinecart spawnerMinecart) {
        return VehicleEntityMarkerBuilder.super.build(spawnerMinecart).map(marker -> {
            marker.setIcon(Icon.SPAWNER_MINECART.getPath(), Icon.SPAWNER_MINECART.getAnchor());
            return marker;
        });
    }

}
