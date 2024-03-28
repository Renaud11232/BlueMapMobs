package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.piglinabstract;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.PiglinBrute;

import java.util.Optional;

public class PiglinBruteMarkerBuilder extends MobEntityMarkerBuilder<PiglinBrute> {

    public PiglinBruteMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(PiglinBrute mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.PIGLIN_BRUTE.getPath(), Icon.PIGLIN_BRUTE.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.piglin_brute", true);
    }
}
