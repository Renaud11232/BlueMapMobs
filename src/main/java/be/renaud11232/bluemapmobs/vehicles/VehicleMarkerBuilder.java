package be.renaud11232.bluemapmobs.vehicles;

import be.renaud11232.bluemapmobs.MarkerBuilder;
import de.bluecolored.bluemap.api.markers.Marker;
import org.bukkit.entity.Boat;
import org.bukkit.entity.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleMarkerBuilder implements MarkerBuilder<Vehicle> {

    private final Map<Class<? extends Vehicle>, MarkerBuilder<? extends Vehicle>> markerBuilders;

    public VehicleMarkerBuilder() {
        markerBuilders = new HashMap<>();
        markerBuilders.put(Boat.class, new BoatMarkerBuilder());
    }

    @Override
    public Optional<Marker> build(Vehicle entity) {
        return null;
    }
}
