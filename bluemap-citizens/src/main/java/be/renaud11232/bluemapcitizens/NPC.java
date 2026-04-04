package be.renaud11232.bluemapcitizens;

import be.renaud11232.bluemapentities.Position;
import be.renaud11232.bluemapentities.WrappedEntity;
import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;

import java.util.UUID;

public class NPC extends WrappedEntity<net.citizensnpcs.api.npc.NPC> {
    public NPC(net.citizensnpcs.api.npc.NPC wrapped) {
        super(wrapped);
    }

    @Override
    public UUID getUUID() {
        return wrapped.getUniqueId();
    }

    @Override
    public String getName() {
        return wrapped.getName();
    }

    @Override
    public Position getPosition() {
        Location location;
        if (wrapped.getEntity() instanceof LivingEntity livingEntity) {
            location = livingEntity.getEyeLocation();
        } else {
            location = wrapped.getStoredLocation();
        }
        return new Position(
                location.getX(),
                location.getY(),
                location.getZ()
        );
    }
}
