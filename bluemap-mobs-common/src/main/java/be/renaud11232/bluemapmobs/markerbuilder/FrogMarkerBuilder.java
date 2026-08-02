package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Frog;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class FrogMarkerBuilder extends MobSingleVariantMarkerBuilder<Frog, Frog.Variant> {
    public FrogMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantIcon(Frog.Variant.TEMPERATE, MobsIcon.FROG_TEMPERATE);
        registerVariantIcon(Frog.Variant.WARM, MobsIcon.FROG_WARM);
        registerVariantIcon(Frog.Variant.COLD, MobsIcon.FROG_COLD);
    }

    @Override
    protected Frog.Variant getVariant(Frog frog) {
        return frog.getVariant();
    }
}
