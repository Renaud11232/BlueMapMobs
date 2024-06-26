package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Breeze;

import java.util.Optional;

public class BreezeMarkerBuilder extends MobEntityMarkerBuilder<Breeze> {

    public BreezeMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Breeze mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.BREEZE.getPath(), Icon.BREEZE.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.breeze", true);
    }
}
