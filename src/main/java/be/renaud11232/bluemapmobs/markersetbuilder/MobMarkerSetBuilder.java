package be.renaud11232.bluemapmobs.markersetbuilder;

import de.bluecolored.bluemap.api.markers.MarkerSet;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Mob;

public class MobMarkerSetBuilder extends EntityMarkerSetBuilder<Mob> {

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

    @Override
    public String getKey() {
        return getConfig().getString("marker_sets.mobs.key", "bluemapmobs-mobs");
    }
}
