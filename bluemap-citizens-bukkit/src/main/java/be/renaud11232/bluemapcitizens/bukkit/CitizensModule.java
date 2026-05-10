package be.renaud11232.bluemapcitizens.bukkit;

import be.renaud11232.bluemapcitizens.bukkit.entity.CitizensNPC;
import be.renaud11232.bluemapcitizens.bukkit.markerbuilder.CitizensMarkerBuilder;
import be.renaud11232.bluemapentities.*;
import be.renaud11232.bluemapentities.module.SimpleModule;
import be.renaud11232.bluemapentities.bukkit.module.configuration.BukkitModuleConfiguration;
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.World;
import org.bukkit.entity.LivingEntity;

import java.util.Collection;
import java.util.stream.StreamSupport;

import static java.util.function.Predicate.not;

public class CitizensModule extends SimpleModule<World, NPC, CitizensNPC> {
    protected CitizensModule(BlueMapEntitiesAPI api, BukkitModuleConfiguration configuration) {
        super(api, configuration, World.class, new CitizensNPCConverter(), new CitizensMarkerBuilder(api));
    }

    @Override
    protected Collection<? extends NPC> getEntities(World world) {
        return StreamSupport.stream(CitizensAPI.getNPCRegistries().spliterator(), false)
                .flatMap(registry -> StreamSupport.stream(registry.spliterator(), false))
                .filter(NPC::isSpawned)
                .filter(not(npc -> npc.getEntity() == null))
                .filter(npc -> npc.getEntity().getWorld().equals(world))
                .filter(not(npc -> npc.getEntity() instanceof LivingEntity livingEntity && livingEntity.isInvisible()))
                .toList();
    }

    @Override
    public String getAssetDirectoryName() {
        return "assets";
    }

    @Override
    public String getModuleIdentifier() {
        return "citizens";
    }
}
