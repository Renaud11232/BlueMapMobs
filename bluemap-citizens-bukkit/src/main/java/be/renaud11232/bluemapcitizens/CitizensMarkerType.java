package be.renaud11232.bluemapcitizens;

import be.renaud11232.bluemapentities.MarkerType;

public enum CitizensMarkerType implements MarkerType {
    NPC;

    @Override
    public String getName() {
        return name();
    }
}
