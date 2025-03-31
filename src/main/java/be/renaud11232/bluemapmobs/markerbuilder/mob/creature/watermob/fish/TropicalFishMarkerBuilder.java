package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.fish;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsStyleClass;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.TropicalFish;

import java.util.Collection;
import java.util.List;

public class TropicalFishMarkerBuilder extends MobEntityMarkerBuilder<TropicalFish> {
    public TropicalFishMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public BooleanConfiguration getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.TROPICAL_FISH;
    }

    @Override
    public Icon getIcon(TropicalFish tropicalFish) {
        return BlueMapMobsIcon.Mob.tropicalFish(tropicalFish);
    }

    @Override
    public Collection<String> getStyleClasses(TropicalFish tropicalFish) {
        return List.of(BlueMapMobsStyleClass.Mob.TROPICAL_FISH, BlueMapMobsStyleClass.Mob.tropicalFish(tropicalFish));
    }
}
