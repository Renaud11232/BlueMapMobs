package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.MarkerBuilder;
import de.bluecolored.bluemap.api.markers.Marker;
import org.bukkit.entity.minecart.SpawnerMinecart;

import java.util.Optional;

public class SpawnerMinecartMarkerBuilder implements MarkerBuilder<SpawnerMinecart> {
    @Override
    public Optional<Marker> build(SpawnerMinecart entity) {
        return Optional.empty();
    }
}
