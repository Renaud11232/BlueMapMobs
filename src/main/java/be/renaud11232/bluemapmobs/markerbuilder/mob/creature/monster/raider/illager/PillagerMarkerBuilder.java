package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Pillager;

import java.util.Optional;

public class PillagerMarkerBuilder extends MobEntityMarkerBuilder<Pillager> {

    public PillagerMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Pillager mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.PILLAGER.getPath(), Icon.PILLAGER.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.pillager", true);
    }
}
