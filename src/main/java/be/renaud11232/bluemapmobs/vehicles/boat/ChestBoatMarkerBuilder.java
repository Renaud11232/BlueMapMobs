package be.renaud11232.bluemapmobs.vehicles.boat;

import be.renaud11232.bluemapmobs.EntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Icon;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.ChestBoat;

import java.util.Optional;

public class ChestBoatMarkerBuilder extends EntityMarkerBuilder<ChestBoat> {

    @Override
    public Optional<POIMarker> buildDefault(ChestBoat chestBoat) {
        return super.buildDefault(chestBoat).map(marker -> {
            switch (chestBoat.getBoatType()) {
                case ACACIA:
                    marker.setIcon(Icon.ACACIA_CHEST_BOAT.getPath(), Icon.ACACIA_CHEST_BOAT.getAnchor());
                    break;
                case BAMBOO:
                    marker.setIcon(Icon.BAMBOO_CHEST_RAFT.getPath(), Icon.BAMBOO_CHEST_RAFT.getAnchor());
                    break;
                case BIRCH:
                    marker.setIcon(Icon.BIRCH_CHEST_BOAT.getPath(), Icon.BIRCH_CHEST_BOAT.getAnchor());
                    break;
                case CHERRY:
                    marker.setIcon(Icon.CHERRY_CHEST_BOAT.getPath(), Icon.CHERRY_CHEST_BOAT.getAnchor());
                    break;
                case DARK_OAK:
                    marker.setIcon(Icon.DARK_OAK_CHEST_BOAT.getPath(), Icon.DARK_OAK_CHEST_BOAT.getAnchor());
                    break;
                case JUNGLE:
                    marker.setIcon(Icon.JUNGLE_CHEST_BOAT.getPath(), Icon.JUNGLE_CHEST_BOAT.getAnchor());
                    break;
                case MANGROVE:
                    marker.setIcon(Icon.MANGROVE_CHEST_BOAT.getPath(), Icon.MANGROVE_CHEST_BOAT.getAnchor());
                    break;
                case OAK:
                    marker.setIcon(Icon.OAK_CHEST_BOAT.getPath(), Icon.OAK_CHEST_BOAT.getAnchor());
                    break;
                case SPRUCE:
                    marker.setIcon(Icon.SPRUCE_CHEST_BOAT.getPath(), Icon.SPRUCE_CHEST_BOAT.getAnchor());
                    break;
            }
            return marker;
        });
    }

}
