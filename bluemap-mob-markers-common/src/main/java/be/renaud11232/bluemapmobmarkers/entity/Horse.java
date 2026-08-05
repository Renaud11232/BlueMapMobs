package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface Horse extends AbstractHorse {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.HORSE;
    }

    Color getColor();

    Style getStyle();

    enum Color {
        WHITE,
        CREAMY,
        CHESTNUT,
        BROWN,
        BLACK,
        GRAY,
        DARK_BROWN
    }

    enum Style {
        NONE,
        WHITE,
        WHITEFIELD,
        WHITE_DOTS,
        BLACK_DOTS
    }
}
