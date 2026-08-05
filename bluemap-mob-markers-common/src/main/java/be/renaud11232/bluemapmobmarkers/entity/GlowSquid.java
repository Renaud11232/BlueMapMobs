package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface GlowSquid extends Squid {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.GLOW_SQUID;
    }
}
