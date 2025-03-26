package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.Icon;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Mob;

import java.util.Optional;

public abstract class SingleIconMobEntityMarkerBuilder<T extends Mob> extends MobEntityMarkerBuilder<T> {
    private final Icon icon;

    public SingleIconMobEntityMarkerBuilder(FileConfiguration config, String displayedConfigKey, Icon icon) {
        super(config, displayedConfigKey);
        this.icon = icon;
    }

    public SingleIconMobEntityMarkerBuilder(FileConfiguration config, Icon icon) {
        this(config, null, icon);
    }

    @Override
    public Optional<POIMarker> buildDefault(T mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }
}
