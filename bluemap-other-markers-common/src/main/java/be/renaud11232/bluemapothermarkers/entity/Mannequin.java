package be.renaud11232.bluemapothermarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapothermarkers.OtherMarkerType;

public interface Mannequin extends LivingEntity {
    @Override
    default MarkerType getMarkerType() {
        return OtherMarkerType.MANNEQUIN;
    }
}
