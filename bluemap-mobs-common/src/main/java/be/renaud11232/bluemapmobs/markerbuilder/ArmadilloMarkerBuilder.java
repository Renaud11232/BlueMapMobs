package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Armadillo;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class ArmadilloMarkerBuilder extends AgeableMarkerBuilder<Armadillo> {
    public ArmadilloMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.ARMADILLO;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.ARMADILLO_BABY;
    }
}
