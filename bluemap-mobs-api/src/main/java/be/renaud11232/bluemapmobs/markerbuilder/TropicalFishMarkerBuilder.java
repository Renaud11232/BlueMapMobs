package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.MobsStyleClass;
import be.renaud11232.bluemapmobs.entity.TropicalFish;

import java.util.Collection;
import java.util.List;

public class TropicalFishMarkerBuilder extends MobMarkerBuilder<TropicalFish> {
    public TropicalFishMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Icon getIcon(TropicalFish tropicalFish) {
        return MobsIcon.tropicalFishPattern(tropicalFish.getPattern(), tropicalFish.getPatternColor());
    }

    @Override
    protected Collection<String> getStyleClasses(TropicalFish tropicalFish) {
        return List.of(MobsStyleClass.tropicalFishBody(tropicalFish.getPattern().getBodyType(), tropicalFish.getBodyColor()));
    }
}
