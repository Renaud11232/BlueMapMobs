package be.renaud11232.bluemapothers;

import be.renaud11232.bluemapentities.MarkerType;

public enum OthersMarkerType implements MarkerType {
    ARMOR_STAND,
    MANNEQUIN;

    @Override
    public String getName() {
        return name();
    }
}
