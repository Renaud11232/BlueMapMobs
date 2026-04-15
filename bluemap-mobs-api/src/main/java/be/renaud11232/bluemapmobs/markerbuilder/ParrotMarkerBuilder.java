package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Parrot;

public class ParrotMarkerBuilder extends SimpleSingleVariantMarkerBuilder<Parrot, Parrot.Variant> {
    public ParrotMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantIcon(Parrot.Variant.RED, MobsIcon.RED_PARROT);
        registerVariantIcon(Parrot.Variant.BLUE, MobsIcon.BLUE_PARROT);
        registerVariantIcon(Parrot.Variant.GREEN, MobsIcon.GREEN_PARROT);
        registerVariantIcon(Parrot.Variant.CYAN, MobsIcon.CYAN_PARROT);
        registerVariantIcon(Parrot.Variant.GRAY, MobsIcon.GRAY_PARROT);
    }

    @Override
    protected Parrot.Variant getVariant(Parrot parrot) {
        return parrot.getVariant();
    }
}
