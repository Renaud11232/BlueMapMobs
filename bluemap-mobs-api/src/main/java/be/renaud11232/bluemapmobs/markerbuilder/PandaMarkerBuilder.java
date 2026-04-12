package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Panda;

public class PandaMarkerBuilder extends SimpleSingleVariantMarkerBuilder<Panda, Panda.Gene> {
    public PandaMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Panda.Gene getVariant(Panda panda) {
        Panda.Gene main = panda.getMainGene();
        if (main.isRecessive()) {
            if (main.equals(panda.getHiddenGene())) {
                return main;
            }
            return Panda.Gene.NORMAL;
        }
        return main;
    }

    @Override
    protected void registerVariantIcons() {
        registerVariantIcon(Panda.Gene.NORMAL, MobsIcon.NORMAL_PANDA);
        registerVariantIcon(Panda.Gene.LAZY, MobsIcon.LAZY_PANDA);
        registerVariantIcon(Panda.Gene.WORRIED, MobsIcon.WORRIED_PANDA);
        registerVariantIcon(Panda.Gene.PLAYFUL, MobsIcon.PLAYFUL_PANDA);
        registerVariantIcon(Panda.Gene.AGGRESSIVE, MobsIcon.AGGRESSIVE_PANDA);
        registerVariantIcon(Panda.Gene.WEAK, MobsIcon.WEAK_PANDA);
        registerVariantIcon(Panda.Gene.BROWN, MobsIcon.BROWN_PANDA);
    }
}
