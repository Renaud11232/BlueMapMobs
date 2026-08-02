package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Panda;

public class PandaMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Panda, Panda.Gene> {
    public PandaMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(Panda.Gene.NORMAL, MobsIcon.PANDA_NORMAL);
        registerVariantAdultIcon(Panda.Gene.LAZY, MobsIcon.PANDA_LAZY);
        registerVariantAdultIcon(Panda.Gene.WORRIED, MobsIcon.PANDA_WORRIED);
        registerVariantAdultIcon(Panda.Gene.PLAYFUL, MobsIcon.PANDA_PLAYFUL);
        registerVariantAdultIcon(Panda.Gene.AGGRESSIVE, MobsIcon.PANDA_AGGRESSIVE);
        registerVariantAdultIcon(Panda.Gene.WEAK, MobsIcon.PANDA_WEAK);
        registerVariantAdultIcon(Panda.Gene.BROWN, MobsIcon.PANDA_BROWN);
        registerVariantBabyIcon(Panda.Gene.NORMAL, MobsIcon.PANDA_NORMAL_BABY);
        registerVariantBabyIcon(Panda.Gene.LAZY, MobsIcon.PANDA_LAZY_BABY);
        registerVariantBabyIcon(Panda.Gene.WORRIED, MobsIcon.PANDA_WORRIED_BABY);
        registerVariantBabyIcon(Panda.Gene.PLAYFUL, MobsIcon.PANDA_PLAYFUL_BABY);
        registerVariantBabyIcon(Panda.Gene.AGGRESSIVE, MobsIcon.PANDA_AGGRESSIVE_BABY);
        registerVariantBabyIcon(Panda.Gene.WEAK, MobsIcon.PANDA_WEAK_BABY);
        registerVariantBabyIcon(Panda.Gene.BROWN, MobsIcon.PANDA_BROWN_BABY);
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
