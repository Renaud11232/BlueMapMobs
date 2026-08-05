package be.renaud11232.bluemapentitymarkers.entity;

import be.renaud11232.bluemapentitymarkers.DefaultMarkerType;
import be.renaud11232.bluemapentitymarkers.MarkerType;

public interface UnknownEntity extends Entity {
    @Override
    default MarkerType getMarkerType() {
        return DefaultMarkerType.UNKNOWN;
    }
}
