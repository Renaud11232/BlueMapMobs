package be.renaud11232.bluemapmobs.updater.impl;

import be.renaud11232.bluemapmobs.BlueMapMobs;
import be.renaud11232.bluemapmobs.markerbuilder.impl.NPCMarkerBuilder;
import be.renaud11232.bluemapmobs.markersetbuilder.impl.NPCMarkerSetBuilder;
import be.renaud11232.bluemapmobs.updater.AbstractWorldMarkerUpdater;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.World;

import java.util.*;
import java.util.stream.StreamSupport;

public class WorldNPCMarkerUpdater extends AbstractWorldMarkerUpdater<NPC> {
    public WorldNPCMarkerUpdater(BlueMapMobs plugin, BlueMapAPI api) {
        super(plugin, api, new NPCMarkerSetBuilder(plugin.getConfig(), plugin.getDefaultConfig()), new NPCMarkerBuilder(plugin.getConfig(), plugin.getDefaultConfig()));
    }

    @Override
    public UUID getUniqueId(NPC npc) {
        return npc.getUniqueId();
    }

    @Override
    public Collection<NPC> getElements(World world) {
        return StreamSupport.stream(CitizensAPI.getNPCRegistry().spliterator(), false)
                .filter(NPC::isSpawned)
                .filter(npc -> npc.getEntity().getWorld().equals(world))
                .toList();
    }
}
