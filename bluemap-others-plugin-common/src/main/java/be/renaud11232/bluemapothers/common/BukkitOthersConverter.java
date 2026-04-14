package be.renaud11232.bluemapothers.common;

import be.renaud11232.bluemapentities.EntityConverter;
import be.renaud11232.bluemapothers.common.entity.BukkitArmorStand;
import be.renaud11232.bluemapothers.common.entity.UnknownBukkitEntity;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;

public abstract class BukkitOthersConverter implements EntityConverter<Entity, be.renaud11232.bluemapentities.entity.Entity> {
    @Override
    public be.renaud11232.bluemapentities.entity.Entity convert(Entity entity) {
        return switch (entity) {
            case ArmorStand armorStand -> new BukkitArmorStand(armorStand);
            default -> new UnknownBukkitEntity(entity);
        };
    }
}
