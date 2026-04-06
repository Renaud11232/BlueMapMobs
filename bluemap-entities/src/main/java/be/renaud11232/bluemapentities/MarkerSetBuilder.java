package be.renaud11232.bluemapentities;

import de.bluecolored.bluemap.api.markers.MarkerSet;

public interface MarkerSetBuilder {
    MarkerSet build();
    String getKey();
}
