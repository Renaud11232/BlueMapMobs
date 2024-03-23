package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.MarkerBuilder;
import de.bluecolored.bluemap.api.markers.Marker;
import org.bukkit.entity.minecart.StorageMinecart;

import java.util.Optional;

public class StorageMinecartMarkerBuilder implements MarkerBuilder<StorageMinecart> {
    @Override
    public Optional<Marker> build(StorageMinecart entity) {
        return Optional.empty();
    }
}
