package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.MarkerBuilder;
import de.bluecolored.bluemap.api.markers.Marker;
import org.bukkit.entity.minecart.ExplosiveMinecart;

import java.util.Optional;

public class ExplosiveMinecartMarkerBuilder implements MarkerBuilder<ExplosiveMinecart> {
    @Override
    public Optional<Marker> build(ExplosiveMinecart entity) {
        return Optional.empty();
    }
}
