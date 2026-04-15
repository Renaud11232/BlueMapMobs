package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Zoglin;

public class ZoglinMarkerBuilder extends AgeableMarkerBuilder<Zoglin> {
    public ZoglinMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.ZOGLIN;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        //TODO: add baby icon
        return super.getDefaultBabyIcon();
    }
}
