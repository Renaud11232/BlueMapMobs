package be.renaud11232.bluemapvehicles;

import be.renaud11232.bluemapentities.MarkerBuilder;
import be.renaud11232.bluemapvehicles.entities.Vehicle;
import de.bluecolored.bluemap.api.markers.Marker;

import java.util.Optional;

public class VehicleMarkerBuilder implements MarkerBuilder<Vehicle> {
    @Override
    public Optional<Marker> build(Vehicle entity) {
        return Optional.empty();
    }
}
