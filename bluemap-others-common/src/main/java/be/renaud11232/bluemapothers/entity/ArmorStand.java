package be.renaud11232.bluemapothers.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapothers.OthersMarkerType;

public interface ArmorStand extends LivingEntity {
    @Override
    default MarkerType getMarkerType() {
        return OthersMarkerType.ARMOR_STAND;
    }
}
