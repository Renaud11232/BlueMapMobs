package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Snowman;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class SnowmanMarkerBuilder extends MobSingleVariantMarkerBuilder<Snowman, Boolean> {
    public SnowmanMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantIcon(true, MobIcon.SNOWMAN_DERP);
        registerVariantIcon(false, MobIcon.SNOWMAN);
    }

    @Override
    protected Boolean getVariant(Snowman snowman) {
        return snowman.isDerp();
    }
}
