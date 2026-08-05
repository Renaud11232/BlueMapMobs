package be.renaud11232.bluemapothermarkers;

import be.renaud11232.bluemapentitymarkers.MarkerType;

public enum OtherMarkerType implements MarkerType {
    ARMOR_STAND,
    MANNEQUIN;

    @Override
    public String getName() {
        return name();
    }
}
