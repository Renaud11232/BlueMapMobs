package be.renaud11232.bluemapcitizens;

import be.renaud11232.bluemapentities.*;
import be.renaud11232.bluemapentities.module.SimpleModule;
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.entity.LivingEntity;

import java.util.Collection;
import java.util.stream.StreamSupport;

import static java.util.function.Predicate.not;

public class CitizensModule extends SimpleModule<NPC, CitizensNPC> {
    protected CitizensModule(BlueMapEntitiesAPI api) {
        super(
                api,
                new CitizensNPCConverter(),
                null,//TODO
                null
        );
    }

    @Override
    protected Collection<NPC> getNativeEntities(Object world) {
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
        return "citizens";
    }

    @Override
    public String getAssetSourcePath() {
        return "assets";
    }
}
