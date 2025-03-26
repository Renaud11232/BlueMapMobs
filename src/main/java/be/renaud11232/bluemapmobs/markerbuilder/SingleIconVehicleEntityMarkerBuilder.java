package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.Icon;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Vehicle;

import java.util.Optional;

public class SingleIconVehicleEntityMarkerBuilder<T extends Vehicle> extends VehicleEntityMarkerBuilder<T> {
    private final Icon icon;

    public SingleIconVehicleEntityMarkerBuilder(FileConfiguration config, String displayedConfigKey, Icon icon) {
        super(config, displayedConfigKey);
        this.icon = icon;
    }

    public SingleIconVehicleEntityMarkerBuilder(FileConfiguration config, Icon icon) {
        this(config, null, icon);
    }

    @Override
    public Optional<POIMarker> buildDefault(T mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }
}
