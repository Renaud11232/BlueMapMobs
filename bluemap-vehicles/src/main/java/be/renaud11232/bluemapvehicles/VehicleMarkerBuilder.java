package be.renaud11232.bluemapvehicles;

import be.renaud11232.bluemapentities.markerbuilder.MarkerBuilder;
import be.renaud11232.bluemapvehicles.entities.Vehicle;
import de.bluecolored.bluemap.api.markers.POIMarker;

import java.util.Optional;

public class VehicleMarkerBuilder implements MarkerBuilder<Vehicle> {
    @Override
    public Optional<POIMarker> build(Vehicle entity) {
        return Optional.empty();
    }//TODO
}
