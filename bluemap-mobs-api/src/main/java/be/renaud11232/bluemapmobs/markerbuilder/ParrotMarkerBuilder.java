package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Parrot;

public class ParrotMarkerBuilder extends SimpleSingleVariantMarkerBuilder<Parrot, Parrot.Variant> {
    public ParrotMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantIcon(Parrot.Variant.RED, MobsIcon.PARROT_RED);
        registerVariantIcon(Parrot.Variant.BLUE, MobsIcon.PARROT_BLUE);
        registerVariantIcon(Parrot.Variant.GREEN, MobsIcon.PARROT_GREEN);
        registerVariantIcon(Parrot.Variant.CYAN, MobsIcon.PARROT_CYAN);
        registerVariantIcon(Parrot.Variant.GRAY, MobsIcon.PARROT_GRAY);
    }

    @Override
    protected Parrot.Variant getVariant(Parrot parrot) {
        return parrot.getVariant();
    }
}
