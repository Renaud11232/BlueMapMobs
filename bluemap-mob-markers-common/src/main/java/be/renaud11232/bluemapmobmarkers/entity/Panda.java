package be.renaud11232.bluemapmobmarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapmobmarkers.MobMarkerType;

public interface Panda extends Animal {
    @Override
    default MarkerType getMarkerType() {
        return MobMarkerType.PANDA;
    }

    Gene getMainGene();

    Gene getHiddenGene();

    enum Gene {
        NORMAL(false),
        LAZY(false),
        WORRIED(false),
        PLAYFUL(false),
        BROWN(true),
        WEAK(true),
        AGGRESSIVE(false);

        private final boolean recessive;

        Gene(boolean recessive) {
            this.recessive = recessive;
        }

        public boolean isRecessive() {
            return this.recessive;
        }
    }
}
