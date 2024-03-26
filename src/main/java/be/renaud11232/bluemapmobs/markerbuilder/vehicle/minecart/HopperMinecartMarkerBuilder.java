package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.markerbuilder.EntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Icon;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.HopperMinecart;

import java.util.Optional;

public class HopperMinecartMarkerBuilder extends EntityMarkerBuilder<HopperMinecart> {

    public HopperMinecartMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(HopperMinecart hopperMinecart) {
        return super.buildDefault(hopperMinecart).map(marker -> {
            marker.setIcon(Icon.HOPPER_MINECART.getPath(), Icon.HOPPER_MINECART.getAnchor());
            return marker;
        });
    }
}
