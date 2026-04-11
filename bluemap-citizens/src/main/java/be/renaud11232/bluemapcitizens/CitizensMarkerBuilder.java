package be.renaud11232.bluemapcitizens;

import be.renaud11232.bluemapentities.MarkerBuilder;
import de.bluecolored.bluemap.api.markers.Marker;

import java.util.Optional;

public class CitizensMarkerBuilder implements MarkerBuilder<CitizensNPC> {
    @Override
    public Optional<Marker> build(CitizensNPC entity) {
        return Optional.empty();//TODO
    }
}
