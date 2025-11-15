package be.renaud11232.bluemapmobs.plugin.markersetbuilder;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.markersetbuilder.AbstractEntityMarkerSetBuilder;
import de.bluecolored.bluemap.api.markers.MarkerSet;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Mob;

public class MobMarkerSetBuilder extends AbstractEntityMarkerSetBuilder<Mob> {

    public MobMarkerSetBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public MarkerSet build() {
        return MarkerSet.builder()
                .label(BlueMapMobsConfiguration.MarkerSets.Mobs.LABEL.get(getConfig(), getDefaultConfig()))
                .toggleable(BlueMapMobsConfiguration.MarkerSets.Mobs.TOGGLEABLE.get(getConfig(), getDefaultConfig()))
                .defaultHidden(BlueMapMobsConfiguration.MarkerSets.Mobs.DEFAULT_HIDDEN.get(getConfig(), getDefaultConfig()))
                .build();
    }

    @Override
    public String getKey() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.KEY.get(getConfig(), getDefaultConfig());
    }
}
