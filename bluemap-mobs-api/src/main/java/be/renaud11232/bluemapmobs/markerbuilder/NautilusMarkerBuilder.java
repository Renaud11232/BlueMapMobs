package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Nautilus;

public class NautilusMarkerBuilder extends AgeableMarkerBuilder<Nautilus> {
    public NautilusMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
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
