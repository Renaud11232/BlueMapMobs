package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.fish;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Configuration;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.TropicalFish;

import java.util.List;
import java.util.Optional;

public class TropicalFishMarkerBuilder extends MobEntityMarkerBuilder<TropicalFish> {
    public TropicalFishMarkerBuilder(FileConfiguration config) {
        super(config, Configuration.MarkerSets.Mobs.Markers.Types.TROPICAL_FISH);
    }

    @Override
    public Optional<POIMarker> buildDefault(TropicalFish tropicalFish) {
        return super.buildDefault(tropicalFish).map(marker -> {
            String bodyType = switch (tropicalFish.getPattern()) {
                case KOB, SUNSTREAK, SNOOPER, DASHER, BRINELY, SPOTTY -> "a";
                case FLOPPER, STRIPEY, GLITTER, BLOCKFISH, BETTY, CLAYFISH -> "b";
            };
            String pattern = switch (tropicalFish.getPattern()) {
                case KOB, FLOPPER -> "1";
                case SUNSTREAK, STRIPEY -> "2";
                case SNOOPER, GLITTER -> "3";
                case DASHER, BLOCKFISH -> "4";
                case BRINELY, BETTY -> "5";
                case SPOTTY, CLAYFISH -> "6";
            };
            MobIcon icon = MobIcon.valueOf(String.format("TROPICAL_FISH_%s_PATTERN_%s_%s", bodyType.toUpperCase(), pattern, tropicalFish.getPatternColor().name()));
            marker.addStyleClasses(List.of("bluemapmobs-tropical-fish", String.format("bluemapmobs-tropical-fish-%s-%s", bodyType, tropicalFish.getBodyColor().name().toLowerCase().replace('_', '-'))));
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }
}
