package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Snowman;

public class SnowmanMarkerBuilder extends MobSingleVariantMarkerBuilder<Snowman, Boolean> {
    public SnowmanMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantIcon(true, MobsIcon.SNOWMAN_DERP);
        registerVariantIcon(false, MobsIcon.SNOWMAN);
    }

    @Override
    protected Boolean getVariant(Snowman snowman) {
        return snowman.isDerp();
    }
}
