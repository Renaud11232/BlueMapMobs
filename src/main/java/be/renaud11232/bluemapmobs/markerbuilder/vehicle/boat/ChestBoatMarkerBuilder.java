package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ChestBoat;

import java.util.Optional;

public class ChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<ChestBoat> {

    public ChestBoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(ChestBoat chestBoat) {
        return super.buildDefault(chestBoat).map(marker -> {
            Icon icon = switch (chestBoat.getBoatType()) {
                case ACACIA -> Icon.ACACIA_CHEST_BOAT;
                case BAMBOO -> Icon.BAMBOO_CHEST_RAFT;
                case BIRCH -> Icon.BIRCH_CHEST_BOAT;
                case CHERRY -> Icon.CHERRY_CHEST_BOAT;
                case DARK_OAK -> Icon.DARK_OAK_CHEST_BOAT;
                case JUNGLE -> Icon.JUNGLE_CHEST_BOAT;
                case MANGROVE -> Icon.MANGROVE_CHEST_BOAT;
                case OAK -> Icon.OAK_CHEST_BOAT;
                case SPRUCE -> Icon.SPRUCE_CHEST_BOAT;
            };
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.vehicles.markers.types.chest_boat", true);
    }

}
