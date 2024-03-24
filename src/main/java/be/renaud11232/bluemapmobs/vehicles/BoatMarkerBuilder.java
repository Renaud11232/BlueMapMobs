package be.renaud11232.bluemapmobs.vehicles;

import be.renaud11232.bluemapmobs.EntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.vehicles.boat.ChestBoatMarkerBuilder;
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
            switch (boat.getBoatType()) {
                case ACACIA:
                    marker.setIcon(Icon.ACACIA_BOAT.getPath(), Icon.ACACIA_BOAT.getAnchor());
                    break;
                case BAMBOO:
                    marker.setIcon(Icon.BAMBOO_RAFT.getPath(), Icon.BAMBOO_RAFT.getAnchor());
                    break;
                case BIRCH:
                    marker.setIcon(Icon.BIRCH_BOAT.getPath(), Icon.BIRCH_BOAT.getAnchor());
                    break;
                case CHERRY:
                    marker.setIcon(Icon.CHERRY_BOAT.getPath(), Icon.CHERRY_BOAT.getAnchor());
                    break;
                case DARK_OAK:
                    marker.setIcon(Icon.DARK_OAK_BOAT.getPath(), Icon.DARK_OAK_BOAT.getAnchor());
                    break;
                case JUNGLE:
                    marker.setIcon(Icon.JUNGLE_BOAT.getPath(), Icon.JUNGLE_BOAT.getAnchor());
                    break;
                case MANGROVE:
                    marker.setIcon(Icon.MANGROVE_BOAT.getPath(), Icon.MANGROVE_BOAT.getAnchor());
                    break;
                case OAK:
                    marker.setIcon(Icon.OAK_BOAT.getPath(), Icon.OAK_BOAT.getAnchor());
                    break;
                case SPRUCE:
                    marker.setIcon(Icon.SPRUCE_BOAT.getPath(), Icon.SPRUCE_BOAT.getAnchor());
                    break;
            }
            return marker;
        });
    }

}
