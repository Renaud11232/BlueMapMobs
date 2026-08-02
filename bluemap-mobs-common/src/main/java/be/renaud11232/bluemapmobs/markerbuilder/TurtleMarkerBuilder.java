package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Turtle;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class TurtleMarkerBuilder extends AgeableMarkerBuilder<Turtle> {
    public TurtleMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
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
