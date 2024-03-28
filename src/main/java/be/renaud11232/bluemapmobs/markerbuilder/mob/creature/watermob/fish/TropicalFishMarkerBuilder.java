package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.fish;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.TropicalFish;

import java.util.Optional;

public class TropicalFishMarkerBuilder extends MobEntityMarkerBuilder<TropicalFish> {

    public TropicalFishMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(TropicalFish mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.TROPICAL_FISH.getPath(), Icon.TROPICAL_FISH.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.tropical_fish", true);
    }
}
