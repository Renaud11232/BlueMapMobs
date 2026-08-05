package be.renaud11232.bluemapcitizensmarkers.bukkit;

import be.renaud11232.bluemapcitizensmarkers.bukkit.entity.CitizensNPC;
import be.renaud11232.bluemapcitizensmarkers.bukkit.markerbuilder.CitizensMarkerBuilder;
import be.renaud11232.bluemapentitymarkers.bukkit.module.BukkitModule;
import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.module.SimpleModule;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.World;
import org.bukkit.entity.LivingEntity;

import java.util.Collection;
import java.util.stream.StreamSupport;

import static java.util.function.Predicate.not;

public class CitizensModule extends SimpleModule<World, NPC, CitizensNPC> implements BukkitModule<NPC> {
    protected CitizensModule(BlueMapAPI api, Configuration configuration) {
        super(api, configuration, new CitizensNPCConverter(), new CitizensMarkerBuilder(api, configuration));
    }

    @Override
    public Collection<? extends NPC> getEntities(World world) {
        return StreamSupport.stream(CitizensAPI.getNPCRegistries().spliterator(), false)
                .flatMap(registry -> StreamSupport.stream(registry.spliterator(), false))
                .filter(NPC::isSpawned)
                .filter(not(npc -> npc.getEntity() == null))
                .filter(npc -> npc.getEntity().getWorld().equals(world))
                .filter(not(npc -> npc.getEntity() instanceof LivingEntity livingEntity && livingEntity.isInvisible()))
                .toList();
    }

    @Override
    public String getModuleIdentifier() {
        return "bluemap-citizens-markers";
    }
}
