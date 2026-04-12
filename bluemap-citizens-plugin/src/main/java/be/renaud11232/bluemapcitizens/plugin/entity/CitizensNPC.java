package be.renaud11232.bluemapcitizens.plugin.entity;

import be.renaud11232.bluemapcitizens.plugin.CitizensMarkerType;
import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapentities.Position;
import be.renaud11232.bluemapentities.Wrapper;
import be.renaud11232.bluemapentities.entity.Entity;
import net.citizensnpcs.api.npc.NPC;
import net.citizensnpcs.trait.SkinTrait;
import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;

import java.util.UUID;

public class CitizensNPC extends Wrapper<NPC> implements Entity {
    public CitizensNPC(NPC wrapped) {
        super(wrapped);
    }

    @Override
    public UUID getUUID() {
        return wrapped.getMinecraftUniqueId();
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

    @Override
    public MarkerType getMarkerType() {
        return CitizensMarkerType.NPC;
    }

    @Override
    public int getBlockLightLevel() {
        return wrapped.getStoredLocation().getBlock().getLightFromBlocks();
    }

    @Override
    public int getSkyLightLevel() {
        return wrapped.getStoredLocation().getBlock().getLightFromSky();
    }

    public SkinTrait getSkinTrait() {
        return wrapped.getTraitNullable(SkinTrait.class);
    }
}
