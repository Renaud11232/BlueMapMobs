package be.renaud11232.bluemapcitizens;

import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapentities.Module;
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.entity.LivingEntity;

import java.util.Collection;
import java.util.stream.StreamSupport;

import static java.util.function.Predicate.not;

public class CitizensModule implements Module {
    @Override
    public Collection<? extends Entity> getEntities(Object world) {
        return StreamSupport.stream(CitizensAPI.getNPCRegistries().spliterator(), false)
                .flatMap(registry -> StreamSupport.stream(registry.spliterator(), false))
                .filter(NPC::isSpawned)
                .filter(not(npc -> npc.getEntity() == null))
                .filter(npc -> npc.getEntity().getWorld().equals(world))
                .filter(not(npc -> npc.getEntity() instanceof LivingEntity livingEntity && livingEntity.isInvisible()))
                .map(CitizensNPC::new)
                .toList();
    }

    @Override
    public void update(Object world) {

    }
}
