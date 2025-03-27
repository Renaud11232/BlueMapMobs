package be.renaud11232.bluemapmobs.markersetbuilder;

import be.renaud11232.bluemapmobs.Configuration;
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
                .label(Configuration.MarkerSets.Mobs.LABEL.get(getConfig()))
                .toggleable(Configuration.MarkerSets.Mobs.TOGGLEABLE.get(getConfig()))
                .defaultHidden(Configuration.MarkerSets.Mobs.DEFAULT_HIDDEN.get(getConfig()))
                .build();
    }

    @Override
    public String getKey() {
        return Configuration.MarkerSets.Mobs.KEY.get(getConfig());
    }
}
