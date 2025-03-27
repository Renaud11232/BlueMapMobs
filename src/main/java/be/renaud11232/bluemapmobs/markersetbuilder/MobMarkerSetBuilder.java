package be.renaud11232.bluemapmobs.markersetbuilder;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
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
                .label(BlueMapMobsConfiguration.MarkerSets.Mobs.LABEL.get(getConfig()))
                .toggleable(BlueMapMobsConfiguration.MarkerSets.Mobs.TOGGLEABLE.get(getConfig()))
                .defaultHidden(BlueMapMobsConfiguration.MarkerSets.Mobs.DEFAULT_HIDDEN.get(getConfig()))
                .build();
    }

    @Override
    public String getKey() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.KEY.get(getConfig());
    }
}
