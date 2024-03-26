package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.CommandMinecart;

import java.util.Optional;

public class CommandMinecartMarkerBuilder extends VehicleEntityMarkerBuilder<CommandMinecart> {

    public CommandMinecartMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(CommandMinecart commandMinecart) {
        return super.buildDefault(commandMinecart).map(marker -> {
            marker.setIcon(Icon.COMMAND_BLOCK_MINECART.getPath(), Icon.COMMAND_BLOCK_MINECART.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.vehicles.markers.types.command_minecart", true);
    }
}
