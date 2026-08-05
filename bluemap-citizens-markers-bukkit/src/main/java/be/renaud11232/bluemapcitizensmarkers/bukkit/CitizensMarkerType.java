package be.renaud11232.bluemapcitizensmarkers.bukkit;

import be.renaud11232.bluemapentitymarkers.MarkerType;

public enum CitizensMarkerType implements MarkerType {
    NPC;

    @Override
    public String getName() {
        return name();
    }
}
