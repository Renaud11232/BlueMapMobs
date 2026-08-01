package be.renaud11232.bluemapothers.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapentities.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapothers.OthersIcon;
import be.renaud11232.bluemapothers.entity.ArmorStand;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class ArmorStandMarkerBuilder extends SimpleMarkerBuilder<ArmorStand> {
    public ArmorStandMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return OthersIcon.ARMOR_STAND;
    }
}
