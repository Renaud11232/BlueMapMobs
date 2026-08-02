package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Snowman;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class SnowmanMarkerBuilder extends MobSingleVariantMarkerBuilder<Snowman, Boolean> {
    public SnowmanMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantIcon(true, MobsIcon.SNOWMAN_DERP);
        registerVariantIcon(false, MobsIcon.SNOWMAN);
    }

    @Override
    protected Boolean getVariant(Snowman snowman) {
        return snowman.isDerp();
    }
}
