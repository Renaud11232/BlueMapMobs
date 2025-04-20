package be.renaud11232.bluemapmobs.markersetbuilder.impl;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.markersetbuilder.AbstractEntityMarkerSetBuilder;
import de.bluecolored.bluemap.api.markers.MarkerSet;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Vehicle;

public class VehicleMarkerSetBuilder extends AbstractEntityMarkerSetBuilder<Vehicle> {

    public VehicleMarkerSetBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public MarkerSet build() {
        return MarkerSet.builder()
                .label(BlueMapMobsConfiguration.MarkerSets.Vehicles.LABEL.get(getConfig(), getDefaultConfig()))
                .toggleable(BlueMapMobsConfiguration.MarkerSets.Vehicles.TOGGLEABLE.get(getConfig(), getDefaultConfig()))
                .defaultHidden(BlueMapMobsConfiguration.MarkerSets.Vehicles.DEFAULT_HIDDEN.get(getConfig(), getDefaultConfig()))
                .build();
    }

    @Override
    public String getKey() {
        return BlueMapMobsConfiguration.MarkerSets.Vehicles.KEY.get(getConfig(), getDefaultConfig());
    }
}
