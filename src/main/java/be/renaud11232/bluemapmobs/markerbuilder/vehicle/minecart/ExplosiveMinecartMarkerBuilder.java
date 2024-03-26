package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.ExplosiveMinecart;

import java.util.Optional;

public class ExplosiveMinecartMarkerBuilder extends VehicleEntityMarkerBuilder<ExplosiveMinecart> {

    public ExplosiveMinecartMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(ExplosiveMinecart explosiveMinecart) {
        return super.buildDefault(explosiveMinecart).map(marker -> {
            marker.setIcon(Icon.TNT_MINECART.getPath(), Icon.TNT_MINECART.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.vehicles.markers.types.explosive_minecart", true);
    }
}
