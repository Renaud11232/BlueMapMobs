package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Nautilus;
import de.bluecolored.bluemap.api.BlueMapAPI;

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
