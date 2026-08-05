package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Turtle;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class TurtleMarkerBuilder extends AgeableMarkerBuilder<Turtle> {
    public TurtleMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.TURTLE;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.TURTLE_BABY;
    }
}
