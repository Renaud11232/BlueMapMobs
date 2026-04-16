package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Panda;

public class PandaMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Panda, Panda.Gene> {
    public PandaMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Panda.Gene.NORMAL, MobsIcon.PANDA_NORMAL);
        registerVariantAdultIcon(Panda.Gene.LAZY, MobsIcon.PANDA_LAZY);
        registerVariantAdultIcon(Panda.Gene.WORRIED, MobsIcon.PANDA_WORRIED);
        registerVariantAdultIcon(Panda.Gene.PLAYFUL, MobsIcon.PANDA_PLAYFUL);
        registerVariantAdultIcon(Panda.Gene.AGGRESSIVE, MobsIcon.PANDA_AGGRESSIVE);
        registerVariantAdultIcon(Panda.Gene.WEAK, MobsIcon.PANDA_WEAK);
        registerVariantAdultIcon(Panda.Gene.BROWN, MobsIcon.PANDA_BROWN);
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
