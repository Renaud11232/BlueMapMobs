package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.BambooChestRaft;

import java.util.Optional;

public class BambooChestRaftMarkerBuilder extends VehicleEntityMarkerBuilder<BambooChestRaft> {

    public BambooChestRaftMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(BambooChestRaft bambooChestRaft) {
        return super.buildDefault(bambooChestRaft).map(marker -> {
            marker.setIcon(Icon.BAMBOO_CHEST_RAFT.getPath(), Icon.BAMBOO_CHEST_RAFT.getAnchor());
            return marker;
        });
    }
}
