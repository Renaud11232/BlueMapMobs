package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.EntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Icon;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.minecart.SpawnerMinecart;

import java.util.Optional;

public class SpawnerMinecartMarkerBuilder  extends EntityMarkerBuilder<SpawnerMinecart> {

    @Override
    public Optional<POIMarker> buildDefault(SpawnerMinecart spawnerMinecart) {
        return super.buildDefault(spawnerMinecart).map(marker -> {
            marker.setIcon(Icon.SPAWNER_MINECART.getPath(), Icon.SPAWNER_MINECART.getAnchor());
            return marker;
        });
    }

}
