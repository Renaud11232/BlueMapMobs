package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Parrot;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class ParrotMarkerBuilder extends MobSingleVariantMarkerBuilder<Parrot, Parrot.Variant> {
    public ParrotMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
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
