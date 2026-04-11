package be.renaud11232.bluemapentities.entity;

import be.renaud11232.bluemapentities.DefaultMarkerType;
import be.renaud11232.bluemapentities.MarkerType;

public interface UnsupportedEntity extends Entity {
    @Override
    default MarkerType getMarkerType() {
        return DefaultMarkerType.UNKNOWN;
    }
}
