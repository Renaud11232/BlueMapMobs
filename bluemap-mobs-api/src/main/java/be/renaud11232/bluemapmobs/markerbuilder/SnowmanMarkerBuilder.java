package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Snowman;

public class SnowmanMarkerBuilder extends SimpleSingleVariantMarkerBuilder<Snowman, Boolean> {
    public SnowmanMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantIcon(true, MobsIcon.DERP_SNOWMAN);
        registerVariantIcon(false, MobsIcon.NORMAL_SNOWMAN);
    }

    @Override
    protected Boolean getVariant(Snowman snowman) {
        return snowman.isDerp();
    }
}
