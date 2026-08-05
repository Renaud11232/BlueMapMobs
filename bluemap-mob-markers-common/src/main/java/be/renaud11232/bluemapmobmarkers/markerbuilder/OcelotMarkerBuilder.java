package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Ocelot;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class OcelotMarkerBuilder extends AgeableMarkerBuilder<Ocelot> {
    public OcelotMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.OCELOT;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.OCELOT_BABY;
    }
}
