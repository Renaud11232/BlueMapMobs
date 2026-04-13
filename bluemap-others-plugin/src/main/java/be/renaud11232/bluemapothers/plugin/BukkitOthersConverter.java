package be.renaud11232.bluemapothers.plugin;

import be.renaud11232.bluemapentities.EntityConverter;
import be.renaud11232.bluemapothers.plugin.entity.BukkitArmorStand;
import be.renaud11232.bluemapothers.plugin.entity.BukkitMannequin;
import be.renaud11232.bluemapothers.plugin.entity.UnknownBukkitEntity;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Mannequin;

public class BukkitOthersConverter implements EntityConverter<Entity, be.renaud11232.bluemapentities.entity.Entity> {
    @Override
    public be.renaud11232.bluemapentities.entity.Entity convert(Entity entity) {
        return switch (entity) {
            case ArmorStand armorStand -> new BukkitArmorStand(armorStand);
            case Mannequin mannequin -> new BukkitMannequin(mannequin);
            default -> new UnknownBukkitEntity(entity);
        };
    }
}
