package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.PoweredMinecart;

import java.util.Optional;

public class PoweredMinecartMarkerBuilder extends VehicleEntityMarkerBuilder<PoweredMinecart> {

    public PoweredMinecartMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(PoweredMinecart poweredMinecart) {
        return super.buildDefault(poweredMinecart).map(marker -> {
            marker.setIcon(Icon.FURNACE_MINECART.getPath(), Icon.FURNACE_MINECART.getAnchor());
            return marker;
        });
    }
}
