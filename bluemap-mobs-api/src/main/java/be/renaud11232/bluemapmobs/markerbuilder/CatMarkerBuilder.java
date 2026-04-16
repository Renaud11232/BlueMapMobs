package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Cat;

public class CatMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Cat, Cat.Type> {
    public CatMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Cat.Type.RED, MobsIcon.CAT_RED);
        registerVariantAdultIcon(Cat.Type.BLACK, MobsIcon.CAT_BLACK);
        registerVariantAdultIcon(Cat.Type.TABBY, MobsIcon.CAT_TABBY);
        registerVariantAdultIcon(Cat.Type.WHITE, MobsIcon.CAT_WHITE);
        registerVariantAdultIcon(Cat.Type.CALICO, MobsIcon.CAT_CALICO);
        registerVariantAdultIcon(Cat.Type.JELLIE, MobsIcon.CAT_JELLIE);
        registerVariantAdultIcon(Cat.Type.PERSIAN, MobsIcon.CAT_PERSIAN);
        registerVariantAdultIcon(Cat.Type.RAGDOLL, MobsIcon.CAT_RAGDOLL);
        registerVariantAdultIcon(Cat.Type.SIAMESE, MobsIcon.CAT_SIAMESE);
        registerVariantAdultIcon(Cat.Type.ALL_BLACK, MobsIcon.CAT_ALL_BLACK);
        registerVariantAdultIcon(Cat.Type.BRITISH_SHORTHAIR, MobsIcon.CAT_BRITISH_SHORTHAIR);
        //TODO: Baby variants
    }

    @Override
    protected Cat.Type getVariant(Cat cat) {
        return cat.getType();
    }
}
