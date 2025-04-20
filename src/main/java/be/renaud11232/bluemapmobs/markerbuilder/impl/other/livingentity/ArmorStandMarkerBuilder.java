package be.renaud11232.bluemapmobs.markerbuilder.impl.other.livingentity;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.OtherEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ArmorStand;

public class ArmorStandMarkerBuilder extends OtherEntityMarkerBuilder<ArmorStand> {
    public ArmorStandMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Others.Markers.Types.ARMOR_STAND;
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Other.ARMOR_STAND;
    }
}
