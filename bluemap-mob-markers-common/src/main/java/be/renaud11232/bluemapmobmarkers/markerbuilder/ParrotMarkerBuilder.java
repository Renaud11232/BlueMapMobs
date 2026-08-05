package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Parrot;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class ParrotMarkerBuilder extends MobSingleVariantMarkerBuilder<Parrot, Parrot.Variant> {
    public ParrotMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantIcon(Parrot.Variant.RED, MobIcon.PARROT_RED);
        registerVariantIcon(Parrot.Variant.BLUE, MobIcon.PARROT_BLUE);
        registerVariantIcon(Parrot.Variant.GREEN, MobIcon.PARROT_GREEN);
        registerVariantIcon(Parrot.Variant.CYAN, MobIcon.PARROT_CYAN);
        registerVariantIcon(Parrot.Variant.GRAY, MobIcon.PARROT_GRAY);
    }

    @Override
    protected Parrot.Variant getVariant(Parrot parrot) {
        return parrot.getVariant();
    }
}
