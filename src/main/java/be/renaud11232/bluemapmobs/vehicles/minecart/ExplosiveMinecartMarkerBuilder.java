package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.EntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Icon;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.minecart.ExplosiveMinecart;

import java.util.Optional;

public class ExplosiveMinecartMarkerBuilder extends EntityMarkerBuilder<ExplosiveMinecart> {
    @Override
    public Optional<POIMarker> buildDefault(ExplosiveMinecart explosiveMinecart) {
        return super.buildDefault(explosiveMinecart).map(marker -> {
            marker.setIcon(Icon.TNT_MINECART.getPath(), Icon.TNT_MINECART.getAnchor());
            return marker;
        });
    }
}
