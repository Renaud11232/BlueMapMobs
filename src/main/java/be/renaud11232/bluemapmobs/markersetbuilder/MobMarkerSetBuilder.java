package be.renaud11232.bluemapmobs.markersetbuilder;

import de.bluecolored.bluemap.api.markers.MarkerSet;
import org.bukkit.configuration.file.FileConfiguration;

public class MobMarkerSetBuilder extends EntityMarkerSetBuilder {

    public MobMarkerSetBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public MarkerSet build() {
        return MarkerSet.builder()
                .label(getConfig().getString("marker_sets.mobs.label", "Mobs"))
                .toggleable(getConfig().getBoolean("marker_sets.mobs.toggleable", true))
                .defaultHidden(getConfig().getBoolean("marker_sets.mobs.default_hidden", true))
                .build();
    }
}
