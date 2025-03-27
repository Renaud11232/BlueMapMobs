package be.renaud11232.bluemapmobs.markersetbuilder;

import be.renaud11232.bluemapmobs.Configuration;
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
                .label(Configuration.MarkerSets.Vehicles.LABEL.get(getConfig()))
                .toggleable(Configuration.MarkerSets.Vehicles.TOGGLEABLE.get(getConfig()))
                .defaultHidden(Configuration.MarkerSets.Vehicles.DEFAULT_HIDDEN.get(getConfig()))
                .build();
    }

    @Override
    public String getKey() {
        return Configuration.MarkerSets.Vehicles.KEY.get(getConfig());
    }
}
