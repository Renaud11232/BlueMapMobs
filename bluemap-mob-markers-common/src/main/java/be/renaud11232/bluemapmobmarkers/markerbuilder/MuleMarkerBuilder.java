package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Mule;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class MuleMarkerBuilder extends AgeableMarkerBuilder<Mule> {
    public MuleMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.MULE;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.MULE_BABY;
    }
}
