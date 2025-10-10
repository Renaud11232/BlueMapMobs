package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.watermob.fish;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsStyleClass;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.TropicalFish;

import java.util.Collection;
import java.util.List;

public class TropicalFishMarkerBuilder extends AbstractMobMarkerBuilder<TropicalFish> {
    public TropicalFishMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.TROPICAL_FISH;
    }

    @Override
    public Icon getIcon(TropicalFish tropicalFish) {
        return BlueMapMobsIcon.Mob.tropicalFishPattern(tropicalFish.getPattern(), tropicalFish.getPatternColor());
    }

    @Override
    public Collection<String> getStyleClasses(TropicalFish tropicalFish) {
        return List.of(BlueMapMobsStyleClass.Mob.tropicalFishBody(tropicalFish.getPattern(), tropicalFish.getBodyColor()));
    }
}
