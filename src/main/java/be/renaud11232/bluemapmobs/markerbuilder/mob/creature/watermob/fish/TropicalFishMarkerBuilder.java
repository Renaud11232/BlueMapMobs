package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.fish;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
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
        return BlueMapMobsIcon.Mob.valueOf(String.format("TROPICAL_FISH_%s_PATTERN_%s_%s", getBodyType(tropicalFish).toUpperCase(), getPattern(tropicalFish), tropicalFish.getPatternColor().name()));
    }

    @Override
    public Collection<String> getStyleClasses(TropicalFish tropicalFish) {
        return List.of("bluemapmobs-tropical-fish", String.format("bluemapmobs-tropical-fish-%s-%s", getBodyType(tropicalFish), tropicalFish.getBodyColor().name().toLowerCase().replace('_', '-')));
    }

    private String getBodyType(TropicalFish tropicalFish) {
        return switch (tropicalFish.getPattern()) {
            case KOB, SUNSTREAK, SNOOPER, DASHER, BRINELY, SPOTTY -> "a";
            case FLOPPER, STRIPEY, GLITTER, BLOCKFISH, BETTY, CLAYFISH -> "b";
        };
    }

    private String getPattern(TropicalFish tropicalFish) {
        return switch (tropicalFish.getPattern()) {
            case KOB, FLOPPER -> "1";
            case SUNSTREAK, STRIPEY -> "2";
            case SNOOPER, GLITTER -> "3";
            case DASHER, BLOCKFISH -> "4";
            case BRINELY, BETTY -> "5";
            case SPOTTY, CLAYFISH -> "6";
        };
    }
}
