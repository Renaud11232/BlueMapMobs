package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.WanderingTrader;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class WanderingTraderMarkerBuilder extends MobMarkerBuilder<WanderingTrader> {
    public WanderingTraderMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobsIcon.WANDERING_TRADER;
    }
}
