package be.renaud11232.bluemapothers.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapothers.OthersMarkerType;

public interface Mannequin extends LivingEntity {
    @Override
    default MarkerType getMarkerType() {
        return OthersMarkerType.MANNEQUIN;
    }
}
