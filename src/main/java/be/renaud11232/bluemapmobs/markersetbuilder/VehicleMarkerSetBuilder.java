package be.renaud11232.bluemapmobs.markersetbuilder;

import de.bluecolored.bluemap.api.markers.MarkerSet;
import org.bukkit.configuration.file.FileConfiguration;

public class VehicleMarkerSetBuilder extends EntityMarkerSetBuilder {

    public VehicleMarkerSetBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public MarkerSet build() {
        return MarkerSet.builder()
                .label(getConfig().getString("marker_sets.vehicles.label", "Vehicles"))
                .toggleable(getConfig().getBoolean("marker_sets.vehicles.toggleable", true))
                .defaultHidden(getConfig().getBoolean("marker_sets.vehicles.default_hidden", true))
                .build();
    }
}
