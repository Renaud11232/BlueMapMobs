package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface TropicalFish extends Fish {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.TROPICAL_FISH;
    }

    Pattern getPattern();

    Color getBodyColor();

    Color getPatternColor();

    enum Pattern {
        KOB(BodyType.SMALL),
        SUNSTREAK(BodyType.SMALL),
        SNOOPER(BodyType.SMALL),
        DASHER(BodyType.SMALL),
        BRINELY(BodyType.SMALL),
        SPOTTY(BodyType.SMALL),
        FLOPPER(BodyType.LARGE),
        STRIPEY(BodyType.LARGE),
        GLITTER(BodyType.LARGE),
        BLOCKFISH(BodyType.LARGE),
        BETTY(BodyType.LARGE),
        CLAYFISH(BodyType.LARGE);

        private final BodyType bodyType;

        Pattern(BodyType bodyType) {
            this.bodyType = bodyType;
        }

        public BodyType getBodyType() {
            return bodyType;
        }
    }

    enum BodyType {
        SMALL,
        LARGE
    }

    enum Color {
        WHITE,
        ORANGE,
        MAGENTA,
        LIGHT_BLUE,
        YELLOW,
        LIME,
        PINK,
        GRAY,
        LIGHT_GRAY,
        CYAN,
        PURPLE,
        BLUE,
        BROWN,
        GREEN,
        RED,
        BLACK
    }
}
