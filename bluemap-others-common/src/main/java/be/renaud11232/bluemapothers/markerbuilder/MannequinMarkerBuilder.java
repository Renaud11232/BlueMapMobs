package be.renaud11232.bluemapothers.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapentities.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapothers.OthersIcon;
import be.renaud11232.bluemapothers.entity.Mannequin;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class MannequinMarkerBuilder extends SimpleMarkerBuilder<Mannequin> {
    public MannequinMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return OthersIcon.MANNEQUIN;//TODO: Handle custom textures
    }
}
