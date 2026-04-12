package be.renaud11232.bluemapmobs.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapmobs.MobsMarkerType;

public interface Llama extends ChestedHorse {
    @Override
    default MarkerType getMarkerType() {
        return MobsMarkerType.LLAMA;
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
        GRAY;
    }
}
