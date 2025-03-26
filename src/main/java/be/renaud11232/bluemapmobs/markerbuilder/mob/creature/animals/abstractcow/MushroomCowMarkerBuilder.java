package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstractcow;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.MushroomCow;

import java.util.Optional;

public class MushroomCowMarkerBuilder extends MobEntityMarkerBuilder<MushroomCow> {

    public MushroomCowMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(MushroomCow mushroomCow) {
        return super.buildDefault(mushroomCow).map(marker -> {
            Icon icon = switch (mushroomCow.getVariant()) {
                case RED -> Icon.RED_MOOSHROOM;
                case BROWN -> Icon.BROWN_MOOSHROOM;
            };
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.mushroom_cow", true);
    }
}
