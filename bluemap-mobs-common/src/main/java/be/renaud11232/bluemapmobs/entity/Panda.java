package be.renaud11232.bluemapmobs.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapmobs.MobsMarkerType;

public interface Panda extends Animal {
    @Override
    default MarkerType getMarkerType() {
        return MobsMarkerType.PANDA;
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
