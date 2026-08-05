package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface Llama extends ChestedHorse {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.LLAMA;
    }

    Carpet getCarpet();

    Color getColor();

    enum Carpet {
        WHITE,
        LIGHT_GRAY,
        GRAY,
        BLACK,
        BROWN,
        RED,
        ORANGE,
        YELLOW,
        LIME,
        GREEN,
        CYAN,
        LIGHT_BLUE,
        BLUE,
        PURPLE,
        MAGENTA,
        PINK
    }

    enum Color {
        CREAMY,
        WHITE,
        BROWN,
        GRAY
    }
}
