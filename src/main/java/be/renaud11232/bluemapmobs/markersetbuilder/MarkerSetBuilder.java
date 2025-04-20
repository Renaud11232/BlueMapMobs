package be.renaud11232.bluemapmobs.markersetbuilder;

import de.bluecolored.bluemap.api.markers.MarkerSet;

public interface MarkerSetBuilder<T> {
    MarkerSet build();
    String getKey();
}
