package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Nautilus;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class NautilusMarkerBuilder extends AgeableMarkerBuilder<Nautilus> {
    public NautilusMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.NAUTILUS;
    }

    @Override
    protected Icon getBabyIcon(Nautilus entity) {
        return MobIcon.NAUTILUS_BABY;
    }
}
