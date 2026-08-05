package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Panda;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class PandaMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Panda, Panda.Gene> {
    public PandaMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(Panda.Gene.NORMAL, MobIcon.PANDA_NORMAL);
        registerVariantAdultIcon(Panda.Gene.LAZY, MobIcon.PANDA_LAZY);
        registerVariantAdultIcon(Panda.Gene.WORRIED, MobIcon.PANDA_WORRIED);
        registerVariantAdultIcon(Panda.Gene.PLAYFUL, MobIcon.PANDA_PLAYFUL);
        registerVariantAdultIcon(Panda.Gene.AGGRESSIVE, MobIcon.PANDA_AGGRESSIVE);
        registerVariantAdultIcon(Panda.Gene.WEAK, MobIcon.PANDA_WEAK);
        registerVariantAdultIcon(Panda.Gene.BROWN, MobIcon.PANDA_BROWN);
        registerVariantBabyIcon(Panda.Gene.NORMAL, MobIcon.PANDA_NORMAL_BABY);
        registerVariantBabyIcon(Panda.Gene.LAZY, MobIcon.PANDA_LAZY_BABY);
        registerVariantBabyIcon(Panda.Gene.WORRIED, MobIcon.PANDA_WORRIED_BABY);
        registerVariantBabyIcon(Panda.Gene.PLAYFUL, MobIcon.PANDA_PLAYFUL_BABY);
        registerVariantBabyIcon(Panda.Gene.AGGRESSIVE, MobIcon.PANDA_AGGRESSIVE_BABY);
        registerVariantBabyIcon(Panda.Gene.WEAK, MobIcon.PANDA_WEAK_BABY);
        registerVariantBabyIcon(Panda.Gene.BROWN, MobIcon.PANDA_BROWN_BABY);
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
