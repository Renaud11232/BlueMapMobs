package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.markerbuilder.EntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Icon;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.CommandMinecart;

import java.util.Optional;

public class CommandMinecartMarkerBuilder extends EntityMarkerBuilder<CommandMinecart> {

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
}
