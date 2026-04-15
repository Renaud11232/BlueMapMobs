package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Piglin;

public class PiglinMarkerBuilder extends AgeableMarkerBuilder<Piglin> {
    public PiglinMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.PIGLIN;
    }

    @Override
    protected Icon getBabyIcon(Piglin entity) {
        //TODO: add baby icon
        return super.getBabyIcon(entity);
    }
}
