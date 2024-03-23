package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.MarkerBuilder;
import de.bluecolored.bluemap.api.markers.Marker;
import org.bukkit.entity.minecart.PoweredMinecart;

import java.util.Optional;

public class PoweredMinecartMarkerBuilder implements MarkerBuilder<PoweredMinecart> {
    @Override
    public Optional<Marker> build(PoweredMinecart entity) {
        return Optional.empty();
    }
}
