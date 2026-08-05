package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Frog;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class FrogMarkerBuilder extends MobSingleVariantMarkerBuilder<Frog, Frog.Variant> {
    public FrogMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantIcon(Frog.Variant.TEMPERATE, MobIcon.FROG_TEMPERATE);
        registerVariantIcon(Frog.Variant.WARM, MobIcon.FROG_WARM);
        registerVariantIcon(Frog.Variant.COLD, MobIcon.FROG_COLD);
    }

    @Override
    protected Frog.Variant getVariant(Frog frog) {
        return frog.getVariant();
    }
}
