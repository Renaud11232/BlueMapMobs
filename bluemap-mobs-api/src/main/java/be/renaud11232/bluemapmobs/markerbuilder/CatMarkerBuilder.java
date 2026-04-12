package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Cat;

public class CatMarkerBuilder extends SimpleSingleVariantMarkerBuilder<Cat, Cat.Type> {
    public CatMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Cat.Type getVariant(Cat cat) {
        return cat.getType();
    }

    @Override
    protected void registerVariantIcons() {
        registerVariantIcon(Cat.Type.RED, MobsIcon.RED_CAT);
        registerVariantIcon(Cat.Type.BLACK, MobsIcon.BLACK_CAT);
        registerVariantIcon(Cat.Type.TABBY, MobsIcon.TABBY_CAT);
        registerVariantIcon(Cat.Type.WHITE, MobsIcon.WHITE_CAT);
        registerVariantIcon(Cat.Type.CALICO, MobsIcon.CALICO_CAT);
        registerVariantIcon(Cat.Type.JELLIE, MobsIcon.JELLIE_CAT);
        registerVariantIcon(Cat.Type.PERSIAN, MobsIcon.PERSIAN_CAT);
        registerVariantIcon(Cat.Type.RAGDOLL, MobsIcon.RAGDOLL_CAT);
        registerVariantIcon(Cat.Type.SIAMESE, MobsIcon.SIAMESE_CAT);
        registerVariantIcon(Cat.Type.ALL_BLACK, MobsIcon.ALL_BLACK_CAT);
        registerVariantIcon(Cat.Type.BRITISH_SHORTHAIR, MobsIcon.BRITISH_SHORTHAIR_CAT);
    }
}
