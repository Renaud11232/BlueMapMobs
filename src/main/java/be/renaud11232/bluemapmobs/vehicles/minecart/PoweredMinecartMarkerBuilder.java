package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.EntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Icon;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.minecart.PoweredMinecart;

import java.util.Optional;

public class PoweredMinecartMarkerBuilder extends EntityMarkerBuilder<PoweredMinecart> {
    @Override
    public Optional<POIMarker> buildDefault(PoweredMinecart poweredMinecart) {
        return super.buildDefault(poweredMinecart).map(marker -> {
            marker.setIcon(Icon.FURNACE_MINECART.getPath(), Icon.FURNACE_MINECART.getAnchor());
            return marker;
        });
    }
}
