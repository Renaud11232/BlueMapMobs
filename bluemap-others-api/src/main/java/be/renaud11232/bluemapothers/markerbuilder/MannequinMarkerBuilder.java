package be.renaud11232.bluemapothers.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapentities.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapothers.OthersIcon;
import be.renaud11232.bluemapothers.entity.Mannequin;

public class MannequinMarkerBuilder extends SimpleMarkerBuilder<Mannequin> {
    public MannequinMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Icon getDefaultIcon() {
        return OthersIcon.MANNEQUIN;
    }
}
