package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Turtle;

public class TurtleMarkerBuilder extends AgeableMarkerBuilder<Turtle> {
    public TurtleMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.TURTLE;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.TURTLE_BABY;
    }
}
