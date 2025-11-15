package be.renaud11232.bluemapmobs.plugin.updater;

import be.renaud11232.bluemapmobs.plugin.BlueMapMobs;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.NPCMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markersetbuilder.NPCMarkerSetBuilder;
import be.renaud11232.bluemapmobs.updater.AbstractWorldMarkerUpdater;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.World;
import org.bukkit.entity.LivingEntity;

import java.util.Collection;
import java.util.UUID;
import java.util.stream.StreamSupport;

import static java.util.function.Predicate.not;

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
