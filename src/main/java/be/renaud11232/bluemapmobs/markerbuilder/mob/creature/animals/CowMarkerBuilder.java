package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.cow.MushroomCowMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Cow;
import org.bukkit.entity.MushroomCow;

import java.util.Optional;

public class CowMarkerBuilder extends MobEntityMarkerBuilder<Cow> {
    public CowMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(MushroomCow.class, new MushroomCowMarkerBuilder(config));
    }

    @Override
    public Optional<POIMarker> buildDefault(Cow mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.COW.getPath(), Icon.COW.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.cow", true);
    }
}
