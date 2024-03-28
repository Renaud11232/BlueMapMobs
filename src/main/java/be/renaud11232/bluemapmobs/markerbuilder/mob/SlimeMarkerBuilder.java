package be.renaud11232.bluemapmobs.markerbuilder.mob;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.slime.MagmaCubeMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.Slime;

import java.util.Optional;

public class SlimeMarkerBuilder extends MobEntityMarkerBuilder<Slime> {
    public SlimeMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(MagmaCube.class, new MagmaCubeMarkerBuilder(config));
    }

    @Override
    public Optional<POIMarker> buildDefault(Slime mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.SLIME.getPath(), Icon.SLIME.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.slime", true);
    }
}
