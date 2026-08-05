package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.MobStyleClass;
import be.renaud11232.bluemapmobmarkers.entity.TropicalFish;
import de.bluecolored.bluemap.api.BlueMapAPI;

import java.util.Collection;
import java.util.List;

public class TropicalFishMarkerBuilder extends MobMarkerBuilder<TropicalFish> {
    public TropicalFishMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    protected Icon getIcon(TropicalFish tropicalFish) {
        return MobIcon.tropicalFishPattern(tropicalFish.getPattern(), tropicalFish.getPatternColor());
    }

    @Override
    protected Collection<String> getStyleClasses(TropicalFish tropicalFish) {
        return List.of(MobStyleClass.tropicalFishBody(tropicalFish.getPattern().getBodyType(), tropicalFish.getBodyColor()));
    }
}
