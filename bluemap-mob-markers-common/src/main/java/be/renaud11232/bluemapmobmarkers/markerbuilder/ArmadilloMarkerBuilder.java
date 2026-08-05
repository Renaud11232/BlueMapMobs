package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Armadillo;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class ArmadilloMarkerBuilder extends AgeableMarkerBuilder<Armadillo> {
    public ArmadilloMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.ARMADILLO;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.ARMADILLO_BABY;
    }
}
