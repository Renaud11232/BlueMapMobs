package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.fish;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.TropicalFish;

import java.util.List;
import java.util.Optional;

public class TropicalFishMarkerBuilder extends MobEntityMarkerBuilder<TropicalFish> {

    public TropicalFishMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(TropicalFish tropicalFish) {
        return super.buildDefault(tropicalFish).map(marker -> {
            Icon icon = Icon.valueOf("TROPICAL_FISH_" + tropicalFish.getPattern().name() + "_" + tropicalFish.getBodyColor().name());
            String bodyType = switch (tropicalFish.getPattern()) {
                case KOB, SUNSTREAK, SNOOPER, DASHER, BRINELY, SPOTTY -> "a";
                case FLOPPER, STRIPEY, GLITTER, BLOCKFISH, BETTY, CLAYFISH -> "b";
            };
            marker.addStyleClasses(List.of("bluemapmobs-tropical-fish", "bluemapmobs-tropical-fish-" + bodyType + "-" + tropicalFish.getBodyColor().name().toLowerCase().replace('_', '-')));
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.tropical_fish", true);
    }
}
