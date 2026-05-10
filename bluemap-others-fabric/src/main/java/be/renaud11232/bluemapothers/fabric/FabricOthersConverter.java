package be.renaud11232.bluemapothers.fabric;

import be.renaud11232.bluemapentities.EntityConverter;
import be.renaud11232.bluemapothers.fabric.entity.FabricArmorStand;
import be.renaud11232.bluemapothers.fabric.entity.FabricMannequin;
import be.renaud11232.bluemapothers.fabric.entity.FabricUnknownEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.decoration.Mannequin;

public class FabricOthersConverter implements EntityConverter<Entity, be.renaud11232.bluemapentities.entity.Entity> {
    @Override
    public be.renaud11232.bluemapentities.entity.Entity convert(Entity entity) {
        return switch (entity) {
            case ArmorStand armorStand -> new FabricArmorStand(armorStand);
            case Mannequin mannequin -> new FabricMannequin(mannequin);
            default -> new FabricUnknownEntity(entity);
        };
    }
}
