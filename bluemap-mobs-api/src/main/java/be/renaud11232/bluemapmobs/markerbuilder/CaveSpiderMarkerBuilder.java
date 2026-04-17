package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.CaveSpider;

public class CaveSpiderMarkerBuilder extends MobMarkerBuilder<CaveSpider> {
    public CaveSpiderMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobsIcon.CAVE_SPIDER;
    }
}
