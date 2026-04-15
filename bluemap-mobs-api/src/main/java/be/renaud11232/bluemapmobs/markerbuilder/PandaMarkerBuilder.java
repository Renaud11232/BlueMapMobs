package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Panda;

public class PandaMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Panda, Panda.Gene> {
    public PandaMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Panda.Gene.NORMAL, MobsIcon.NORMAL_PANDA);
        registerVariantAdultIcon(Panda.Gene.LAZY, MobsIcon.LAZY_PANDA);
        registerVariantAdultIcon(Panda.Gene.WORRIED, MobsIcon.WORRIED_PANDA);
        registerVariantAdultIcon(Panda.Gene.PLAYFUL, MobsIcon.PLAYFUL_PANDA);
        registerVariantAdultIcon(Panda.Gene.AGGRESSIVE, MobsIcon.AGGRESSIVE_PANDA);
        registerVariantAdultIcon(Panda.Gene.WEAK, MobsIcon.WEAK_PANDA);
        registerVariantAdultIcon(Panda.Gene.BROWN, MobsIcon.BROWN_PANDA);
        //TODO: add baby variants
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
}
