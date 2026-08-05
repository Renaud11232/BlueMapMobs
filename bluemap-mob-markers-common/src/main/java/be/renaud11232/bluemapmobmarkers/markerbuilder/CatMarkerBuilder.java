package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Cat;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class CatMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Cat, Cat.Type> {
    public CatMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(Cat.Type.RED, MobIcon.CAT_RED);
        registerVariantAdultIcon(Cat.Type.BLACK, MobIcon.CAT_BLACK);
        registerVariantAdultIcon(Cat.Type.TABBY, MobIcon.CAT_TABBY);
        registerVariantAdultIcon(Cat.Type.WHITE, MobIcon.CAT_WHITE);
        registerVariantAdultIcon(Cat.Type.CALICO, MobIcon.CAT_CALICO);
        registerVariantAdultIcon(Cat.Type.JELLIE, MobIcon.CAT_JELLIE);
        registerVariantAdultIcon(Cat.Type.PERSIAN, MobIcon.CAT_PERSIAN);
        registerVariantAdultIcon(Cat.Type.RAGDOLL, MobIcon.CAT_RAGDOLL);
        registerVariantAdultIcon(Cat.Type.SIAMESE, MobIcon.CAT_SIAMESE);
        registerVariantAdultIcon(Cat.Type.ALL_BLACK, MobIcon.CAT_ALL_BLACK);
        registerVariantAdultIcon(Cat.Type.BRITISH_SHORTHAIR, MobIcon.CAT_BRITISH_SHORTHAIR);
        registerVariantBabyIcon(Cat.Type.RED, MobIcon.CAT_RED_BABY);
        registerVariantBabyIcon(Cat.Type.BLACK, MobIcon.CAT_BLACK_BABY);
        registerVariantBabyIcon(Cat.Type.TABBY, MobIcon.CAT_TABBY_BABY);
        registerVariantBabyIcon(Cat.Type.WHITE, MobIcon.CAT_WHITE_BABY);
        registerVariantBabyIcon(Cat.Type.CALICO, MobIcon.CAT_CALICO_BABY);
        registerVariantBabyIcon(Cat.Type.JELLIE, MobIcon.CAT_JELLIE_BABY);
        registerVariantBabyIcon(Cat.Type.PERSIAN, MobIcon.CAT_PERSIAN_BABY);
        registerVariantBabyIcon(Cat.Type.RAGDOLL, MobIcon.CAT_RAGDOLL_BABY);
        registerVariantBabyIcon(Cat.Type.SIAMESE, MobIcon.CAT_SIAMESE_BABY);
        registerVariantBabyIcon(Cat.Type.ALL_BLACK, MobIcon.CAT_ALL_BLACK_BABY);
        registerVariantBabyIcon(Cat.Type.BRITISH_SHORTHAIR, MobIcon.CAT_BRITISH_SHORTHAIR_BABY);
    }

    @Override
    protected Cat.Type getVariant(Cat cat) {
        return cat.getType();
    }
}
