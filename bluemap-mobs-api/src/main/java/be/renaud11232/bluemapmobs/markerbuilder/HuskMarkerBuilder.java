package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Husk;

public class HuskMarkerBuilder extends AgeableMarkerBuilder<Husk> {
    public HuskMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.HUSK;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        //TODO: add baby icon
        return super.getDefaultBabyIcon();
    }
}
