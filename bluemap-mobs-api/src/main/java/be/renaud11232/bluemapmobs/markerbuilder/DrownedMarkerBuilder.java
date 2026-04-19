package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.MobsStyleClass;
import be.renaud11232.bluemapmobs.entity.Drowned;

import java.util.Collection;
import java.util.List;

public class DrownedMarkerBuilder extends AgeableMarkerBuilder<Drowned> {
    public DrownedMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.DROWNED_OUTER_LAYER;
    }

    @Override
    protected Collection<String> getDefaultAdultStyleClasses() {
        return List.of(MobsStyleClass.DROWNED);
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.DROWNED_OUTER_LAYER_BABY;
    }

    @Override
    protected Collection<String> getBabyStyleClasses(Drowned entity) {
        return List.of(MobsStyleClass.DROWNED_BABY);
    }
}
