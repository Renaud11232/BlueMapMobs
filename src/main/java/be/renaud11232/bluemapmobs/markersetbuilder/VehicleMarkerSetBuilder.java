package be.renaud11232.bluemapmobs.markersetbuilder;

import de.bluecolored.bluemap.api.markers.MarkerSet;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Vehicle;

public class VehicleMarkerSetBuilder extends EntityMarkerSetBuilder<Vehicle> {

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

    @Override
    public String getKey() {
        return getConfig().getString("marker_sets.vehicles.key", "bluemapmobs-mobs");
    }
}
