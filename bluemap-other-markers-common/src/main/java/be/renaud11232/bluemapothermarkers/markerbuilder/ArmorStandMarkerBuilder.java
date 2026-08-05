package be.renaud11232.bluemapothermarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapentitymarkers.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapothermarkers.OtherIcon;
import be.renaud11232.bluemapothermarkers.entity.ArmorStand;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class ArmorStandMarkerBuilder extends SimpleMarkerBuilder<ArmorStand> {
    public ArmorStandMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return OtherIcon.ARMOR_STAND;
    }
}
