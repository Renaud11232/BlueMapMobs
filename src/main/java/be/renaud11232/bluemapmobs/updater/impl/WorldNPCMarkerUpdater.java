package be.renaud11232.bluemapmobs.updater.impl;

import be.renaud11232.bluemapmobs.BlueMapMobs;
import be.renaud11232.bluemapmobs.markerbuilder.impl.NPCMarkerBuilder;
import be.renaud11232.bluemapmobs.markersetbuilder.impl.NPCMarkerSetBuilder;
import be.renaud11232.bluemapmobs.updater.AbstractWorldMarkerUpdater;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.World;
import org.bukkit.entity.LivingEntity;

import java.util.*;
import static java.util.function.Predicate.not;
import java.util.stream.StreamSupport;

public class WorldNPCMarkerUpdater extends AbstractWorldMarkerUpdater<NPC> {
    public WorldNPCMarkerUpdater(BlueMapMobs plugin, BlueMapAPI api) {
        super(plugin, api, new NPCMarkerSetBuilder(plugin.getConfig(), plugin.getDefaultConfig()), new NPCMarkerBuilder(api, plugin.getConfig(), plugin.getDefaultConfig()));
    }

    @Override
    public UUID getUniqueId(NPC npc) {
        return npc.getUniqueId();
    }

    @Override
    public Collection<NPC> getElements(World world) {
        return StreamSupport.stream(CitizensAPI.getNPCRegistries().spliterator(), false)
                .flatMap(registry -> StreamSupport.stream(registry.spliterator(), false))
                .filter(NPC::isSpawned)
                .filter(not(npc -> npc.getEntity() == null))
                .filter(npc -> npc.getEntity().getWorld().equals(world))
                .filter(not(npc -> npc.getEntity() instanceof LivingEntity livingEntity && livingEntity.isInvisible()))
                .toList();
    }
}
