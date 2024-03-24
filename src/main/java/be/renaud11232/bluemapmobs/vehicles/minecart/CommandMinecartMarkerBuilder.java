package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.EntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Icon;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.minecart.CommandMinecart;

import java.util.Optional;

public class CommandMinecartMarkerBuilder extends EntityMarkerBuilder<CommandMinecart> {
    @Override
    public Optional<POIMarker> buildDefault(CommandMinecart commandMinecart) {
        return super.buildDefault(commandMinecart).map(marker -> {
            marker.setIcon(Icon.COMMAND_BLOCK_MINECART.getPath(), Icon.COMMAND_BLOCK_MINECART.getAnchor());
            return marker;
        });
    }
}
