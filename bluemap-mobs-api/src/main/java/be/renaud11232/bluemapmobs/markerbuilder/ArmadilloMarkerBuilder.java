package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Armadillo;

public class ArmadilloMarkerBuilder extends AgeableMarkerBuilder<Armadillo> {
    public ArmadilloMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
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
