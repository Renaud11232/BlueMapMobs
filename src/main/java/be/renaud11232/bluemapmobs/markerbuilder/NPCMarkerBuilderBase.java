package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsStyleClass;
import be.renaud11232.bluemapmobs.icon.Icon;
import de.bluecolored.bluemap.api.markers.POIMarker;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.Optional;

public class NPCMarkerBuilderBase extends MarkerBuilderBase<NPC> {
    public NPCMarkerBuilderBase(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Optional<POIMarker> build(NPC npc) {
        return super.build(npc).map(marker -> {
            //TODO eye location ?
            marker.setMaxDistance(BlueMapMobsConfiguration.MarkerSets.NPCs.Markers.MAX_DISTANCE.get(getConfig(), getDefaultConfig()));
            return marker;
        });
    }

    @Override
    public Optional<POIMarker> buildDefault(NPC npc) {
        Location location = npc.getStoredLocation();
        Icon icon = BlueMapMobsIcon.UNKNOWN;
        return Optional.of(
                POIMarker.builder()
                        .label(npc.getName())
                        .position(location.getX(), location.getY(), location.getZ())
                        .icon(icon.getPath(), icon.getAnchor())
                        .styleClasses(BlueMapMobsStyleClass.MARKER)
                        .build()
        );
    }

    @Override
    public Block getBlock(NPC npc) {
        return npc.getStoredLocation().getBlock();
    }
}
