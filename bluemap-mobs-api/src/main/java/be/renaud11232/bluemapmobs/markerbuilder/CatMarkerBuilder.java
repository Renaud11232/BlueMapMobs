package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Cat;

public class CatMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Cat, Cat.Type> {
    public CatMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Cat.Type.RED, MobsIcon.RED_CAT);
        registerVariantAdultIcon(Cat.Type.BLACK, MobsIcon.BLACK_CAT);
        registerVariantAdultIcon(Cat.Type.TABBY, MobsIcon.TABBY_CAT);
        registerVariantAdultIcon(Cat.Type.WHITE, MobsIcon.WHITE_CAT);
        registerVariantAdultIcon(Cat.Type.CALICO, MobsIcon.CALICO_CAT);
        registerVariantAdultIcon(Cat.Type.JELLIE, MobsIcon.JELLIE_CAT);
        registerVariantAdultIcon(Cat.Type.PERSIAN, MobsIcon.PERSIAN_CAT);
        registerVariantAdultIcon(Cat.Type.RAGDOLL, MobsIcon.RAGDOLL_CAT);
        registerVariantAdultIcon(Cat.Type.SIAMESE, MobsIcon.SIAMESE_CAT);
        registerVariantAdultIcon(Cat.Type.ALL_BLACK, MobsIcon.ALL_BLACK_CAT);
        registerVariantAdultIcon(Cat.Type.BRITISH_SHORTHAIR, MobsIcon.BRITISH_SHORTHAIR_CAT);
        //TODO: Baby variants
    }

    @Override
    protected Cat.Type getVariant(Cat cat) {
        return cat.getType();
    }
}
