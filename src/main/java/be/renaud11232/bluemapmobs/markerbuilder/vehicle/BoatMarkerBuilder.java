package be.renaud11232.bluemapmobs.markerbuilder.vehicle;

import be.renaud11232.bluemapmobs.markerbuilder.EntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat.ChestBoatMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.Boat;
import org.bukkit.entity.ChestBoat;

import java.util.Optional;

public class BoatMarkerBuilder extends EntityMarkerBuilder<Boat> {

    public BoatMarkerBuilder() {
        registerMarkerBuilder(ChestBoat.class, new ChestBoatMarkerBuilder());
    }

    @Override
    public Optional<POIMarker> buildDefault(Boat boat) {
        return super.buildDefault(boat).map(marker -> {
            Icon icon = switch (boat.getBoatType()) {
                case ACACIA -> Icon.ACACIA_BOAT;
                case BAMBOO -> Icon.BAMBOO_RAFT;
                case BIRCH -> Icon.BIRCH_BOAT;
                case CHERRY -> Icon.CHERRY_BOAT;
                case DARK_OAK -> Icon.DARK_OAK_BOAT;
                case JUNGLE -> Icon.JUNGLE_BOAT;
                case MANGROVE -> Icon.MANGROVE_BOAT;
                case OAK -> Icon.OAK_BOAT;
                case SPRUCE -> Icon.SPRUCE_BOAT;
            };
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

}
