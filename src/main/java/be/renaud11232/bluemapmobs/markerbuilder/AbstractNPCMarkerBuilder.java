package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import de.bluecolored.bluemap.api.markers.POIMarker;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.Optional;

public abstract class AbstractNPCMarkerBuilder extends AbstractMarkerBuilder<NPC> {
    public AbstractNPCMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Optional<POIMarker> build(NPC npc) {
        return super.build(npc).map(marker -> {
            marker.setLabel(npc.getName());
            marker.setDetail(npc.getName());
            Location location = npc.getStoredLocation();
            marker.setPosition(location.getX(), location.getY(), location.getZ());
            marker.setMaxDistance(BlueMapMobsConfiguration.MarkerSets.NPCs.Markers.MAX_DISTANCE.get(getConfig(), getDefaultConfig()));
            return marker;
        });
    }

    @Override
    public Block getBlock(NPC npc) {
        return npc.getStoredLocation().getBlock();
    }
}
