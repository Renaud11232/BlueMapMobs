package be.renaud11232.bluemapmobs.markersetbuilder;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import de.bluecolored.bluemap.api.markers.MarkerSet;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;

public class OtherMarkerSetBuilder extends EntityMarkerSetBuilder<Entity> {
    public OtherMarkerSetBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public MarkerSet build() {
        return MarkerSet.builder()
                .label(BlueMapMobsConfiguration.MarkerSets.Others.LABEL.get(getConfig(), getDefaultConfig()))
                .toggleable(BlueMapMobsConfiguration.MarkerSets.Others.TOGGLEABLE.get(getConfig(), getDefaultConfig()))
                .defaultHidden(BlueMapMobsConfiguration.MarkerSets.Others.DEFAULT_HIDDEN.get(getConfig(), getDefaultConfig()))
                .build();
    }

    @Override
    public String getKey() {
        return BlueMapMobsConfiguration.MarkerSets.Others.KEY.get(getConfig(), getDefaultConfig());
    }
}
