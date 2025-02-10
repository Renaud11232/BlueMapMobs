package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.BambooRaft;

import java.util.Optional;

public class BambooRaftMarkerBuilder extends VehicleEntityMarkerBuilder<BambooRaft> {

    public BambooRaftMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(BambooRaft bambooRaft) {
        return super.buildDefault(bambooRaft).map(marker -> {
            marker.setIcon(Icon.BAMBOO_RAFT.getPath(), Icon.BAMBOO_RAFT.getAnchor());
            return marker;
        });
    }
}
