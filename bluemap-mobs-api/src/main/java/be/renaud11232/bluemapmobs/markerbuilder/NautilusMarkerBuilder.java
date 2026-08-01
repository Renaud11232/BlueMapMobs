package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Nautilus;

public class NautilusMarkerBuilder extends AgeableMarkerBuilder<Nautilus> {
    public NautilusMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.NAUTILUS;
    }

    @Override
    protected Icon getBabyIcon(Nautilus entity) {
        return MobsIcon.NAUTILUS_BABY;
    }
}
