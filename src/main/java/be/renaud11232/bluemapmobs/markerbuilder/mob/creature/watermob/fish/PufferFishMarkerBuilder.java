package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.fish;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.PufferFish;

import java.util.Optional;

public class PufferFishMarkerBuilder extends MobEntityMarkerBuilder<PufferFish> {

    public PufferFishMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(PufferFish mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.PUFFER_FISH.getPath(), Icon.PUFFER_FISH.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.puffer_fish", true);
    }
}
