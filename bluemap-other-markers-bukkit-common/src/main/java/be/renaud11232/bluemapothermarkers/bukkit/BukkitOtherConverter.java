package be.renaud11232.bluemapothermarkers.bukkit;

import be.renaud11232.bluemapentitymarkers.EntityConverter;
import be.renaud11232.bluemapothermarkers.bukkit.entity.BukkitArmorStand;
import be.renaud11232.bluemapothermarkers.bukkit.entity.BukkitUnknownEntity;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;

public abstract class BukkitOtherConverter implements EntityConverter<Entity, be.renaud11232.bluemapentitymarkers.entity.Entity> {
    @Override
    public be.renaud11232.bluemapentitymarkers.entity.Entity convert(Entity entity) {
        return switch (entity) {
            case ArmorStand armorStand -> new BukkitArmorStand(armorStand);
            default -> new BukkitUnknownEntity(entity);
        };
    }
}
